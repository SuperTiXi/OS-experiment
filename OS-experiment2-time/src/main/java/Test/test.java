package Test;

import bean.Process;
import service.ProcessService;

import java.util.ArrayList;

public class test {
    static int cpuTime = 0;
    public static void main(String[] args) {
        ProcessService processService = new ProcessService();
        ArrayList<Process> p = processService.loadData();
        processService.printData(p,cpuTime);

        boolean flag = true;

        while(flag){
            int i = 0;
            while(p.get(i).getPcb().getRunTime()==p.get(i).getPcb().getAskTime()){
                i++;
            }
            Process process = p.get(i);
            process.run();
            cpuTime++;
            processService.printData(p,cpuTime);
            p.remove(i);
            p.add(process);

            if(process.getPcb().getAskTime()>process.getPcb().getRunTime()){
                process.getPcb().setState("ready");
            }

            flag = false;
            for(int j = 0;j<p.size();j++){

                flag = flag||p.get(j).getPcb().getAskTime()>p.get(j).getPcb().getRunTime();
            }
        }
    }
}
