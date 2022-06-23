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
        Page p1 = new Page(0,0,0,1024*0,0);
        Page p2 = new Page(1,0,0,1024*1,0);
        Page p3 = new Page(2,0,0,1024*2,0);
        Page p4 = new Page(3,0,0,1024*3,0);
        Page p5 = new Page(4,0,0,1024*4,0);
        Page p6 = new Page(5,0,0,1024*5,0);
        Page p7 = new Page(6,0,0,1024*6,0);

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
        System.out.println("页号\t"+"标志\t"+"主存块号\t"+"修改标志\t"+"磁盘位置");
        for(int i = 0;i<p.size();i++){
            Page page = p.get(i);
            System.out.println(page.getNum()+"\t"+ page.getFlag()+"\t"+ page.getMemoryNum()+"\t\t"+ page.getIsModify()+"\t\t"+ page.getDiskNum());
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
                page.setIsModify(1);
                System.out.println("AbsoluteAddress:"+memoryNum*1024+address);
                break;
            }
        }
        return flag;
    }

    /**
     * 先进先出算法
     * @param page 进入的页
     * @param memory 主存
     * @param set 进入的页在磁盘中的位置
     * @param disk 磁盘
     * @return 主存和磁盘数组
     */
    public ArrayList<Page>[] FIFO(Page page,ArrayList<Page> memory,int set,ArrayList<Page> disk){
        Page p = memory.get(0);
        ArrayList<Page>[] modify = new ArrayList[2];
        if(p.getIsModify()==0){
            memory.remove(0);
            memory.add(page);
            modify[0] = memory;
            modify[1] = disk;
            System.out.println("移出页号"+p.getNum()+",移入页号"+page.getNum());
        }
        else if(p.getIsModify()==1){
            disk.set(set,p);
            memory.remove(0);
            memory.add(page);
            modify[0] = memory;
            modify[1] = disk;
            System.out.println("移出页号"+p.getNum()+",移入页号"+page.getNum());

            return modify;
        }
        return modify;
    }
}
