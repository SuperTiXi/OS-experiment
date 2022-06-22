package service;

import bean.PCB;
import bean.Process;

public class ProcessService {

    /**
     * 为进程按优先级排序
     * @param p 传入的进程数组
     * @return 排完序后的数组
     */
    public Process[] sortProcess(Process[] p){
        for(int i = 0;i< p.length;i++){
            for(int j = i+1;j<p.length;j++){
                if(p[i].getPcb().getPriority()>p[j].getPcb().getPriority()){
                    Process temp;
                    temp = p[j];
                    p[j] = p[i];
                    p[i] = temp;
                }
            }
        }
        return p;
    }

    /**
     * 加载数据
     * @return 加载数据
     */
    public  Process[] loadData(){
        PCB pcb1 = new PCB("P1",2,1);
        PCB pcb2 = new PCB("P2",3,5);
        PCB pcb3 = new PCB("P3",1,3);
        PCB pcb4 = new PCB("P4",2,4);
        PCB pcb5 = new PCB("P5",4,2);

        Process p1 = new Process();
        p1.setPcb(pcb1);

        Process p2 = new Process();
        p2.setPcb(pcb2);

        Process p3 = new Process();
        p3.setPcb(pcb3);

        Process p4 = new Process();
        p4.setPcb(pcb4);

        Process p5 = new Process();
        p5.setPcb(pcb5);

        Process[] p = new Process[5];
        p[0] = p1;
        p[1] = p2;
        p[2] = p3;
        p[3] = p4;
        p[4] = p5;

        return  p;
    }

    /**
     * 打印进程信息
     * @param p 进程数组
     * @param cpuTime cpu时间
     */
    public void printData(Process[] p ,int cpuTime){
        System.out.println("CPUTIME:"+cpuTime);
        System.out.println("Name\t"+""+"NeedTime\t"+""+"Priority\t"+""+"State");
        for(int i = 0 ; i<p.length;i++){
            PCB pcb = p[i].getPcb();
            System.out.println(pcb.getName()+"\t\t"+pcb.getAskTime()+"\t\t\t"+pcb.getPriority()+"\t\t\t"+pcb.getState());
        }
    }
}
