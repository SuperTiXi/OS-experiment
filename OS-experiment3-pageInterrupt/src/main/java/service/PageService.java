package service;

import bean.Page;

import java.util.ArrayList;

public class PageService {

    /**
     * 加载数据
     * @return
     */
    public ArrayList<Page> loadData(){
        ArrayList<Page> p = new ArrayList<>();
        Page p1 = new Page(0,0,0,1024*0);
        Page p2 = new Page(1,0,0,1024*1);
        Page p3 = new Page(2,0,0,1024*2);
        Page p4 = new Page(3,0,0,1024*3);
        Page p5 = new Page(4,0,0,1024*4);
        Page p6 = new Page(5,0,0,1024*5);
        Page p7 = new Page(6,0,0,1024*6);

        p.add(p1);
        p.add(p2);
        p.add(p3);
        p.add(p4);
        p.add(p5);
        p.add(p6);
        p.add(p7);

        return p;
    }

    /**
     * 打印数据
     * @param p 要打印的数据
     */
    public void printData(ArrayList<Page> p){
        System.out.println("页号\t"+"标志\t"+"主存块号\t"+"磁盘位置");
        for(int i = 0;i<p.size();i++){
            Page page = p.get(i);
            System.out.println(page.getNum()+"\t"+ page.getFlag()+"\t"+ page.getMemoryNum()+"\t\t"+ page.getDiskNum());
        }
    }

    /**
     * 是否命中
     * @param memoryNum 主存页号
     * @param address 地址
     * @param p 主存
     * @return 是否命中
     */
    public boolean hit(int memoryNum,int address,ArrayList<Page> p){
        boolean flag = false;
        for(int j = 0;j<p.size();j++){
            Page page = p.get(j);
            if(page.getNum()==memoryNum&&address>=0&&address<=1024){
                flag = true;
                System.out.println("AbsoluteAddress:"+memoryNum*1024+address);
                break;
            }
        }
        return flag;
    }
}
