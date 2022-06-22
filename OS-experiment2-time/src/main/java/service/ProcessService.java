package service;

import bean.PCB;
import bean.Process;

import java.util.ArrayList;

public class ProcessService {

    /**
     * 加载数据
     * @return 加载数据
     */
    public ArrayList<Process> loadData() {
        PCB pcb1 = new PCB("P1", 2);
        PCB pcb2 = new PCB("P2", 3);
        PCB pcb3 = new PCB("P3", 1);
        PCB pcb4 = new PCB("P4", 2);
        PCB pcb5 = new PCB("P5", 4);

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

        ArrayList<Process> p = new ArrayList<>();
        p.add(p1);
        p.add(p2);
        p.add(p3);
        p.add(p4);
        p.add(p5);

        return p;
    }

    /**
     * 打印进程信息
     * @param p 进程列表
     * @param cpuTime cpu时间
     */
    public void printData(ArrayList<Process> p ,int cpuTime){
        System.out.println("CPUTIME:"+cpuTime);
        System.out.println("Name\t"+""+"NeedTime\t"+""+"RunTime\t"+""+"State");
        for(int i = 0 ; i<p.size();i++){
            PCB pcb = p.get(i).getPcb();
            System.out.println(pcb.getName()+"\t\t"+pcb.getAskTime()+"\t\t\t"+pcb.getRunTime()+"\t\t\t"+pcb.getState());
        }
    }
}
