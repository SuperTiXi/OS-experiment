package test;

import bean.Page;
import service.PageService;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    static int memorySize = 3;
    public static void main(String[] args) {
        PageService pageService = new PageService();

        //磁盘和主存空间
        ArrayList<Page> disk = pageService.loadData();
        ArrayList<Page> memory = new ArrayList<>(memorySize);

        //加载页
        for(int i = 0;i<memorySize;i++){
            Page page = disk.get(i);
            page.setFlag(1);
            page.setMemoryNum(i);
            memory.add(page);
        }
        //打印加载完的主存
        pageService.printData(memory);

        //读取指令并操作
        int memoryNum;
        int address;
        boolean flag = false;
        while(true){
            Scanner in = new Scanner(System.in);
            System.out.println("输入页号(0-6)只开辟了3个主存页");
            memoryNum = in.nextInt();
            System.out.println("输入页内地址(0-1024)");
            address = in.nextInt();

            flag = pageService.hit(memoryNum,address,memory);

            if(!flag){
                for(int j = 0;j<disk.size();j++){
                    Page page = disk.get(j);
                    if(page.getNum()==memoryNum){
                        ArrayList<Page>[] modify = pageService.FIFO(page,memory,j,disk);
                        pageService.printData(memory);
                        memory = modify[0];
                        disk = modify[1];
                        break;
                    }
                }
            }
        }
    }
}
