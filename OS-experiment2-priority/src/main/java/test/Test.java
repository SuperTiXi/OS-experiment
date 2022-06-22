package test;

import bean.Process;
import service.ProcessService;

public class Test {

    static int cpuTime = 0;

    public static void main(String[] args) {
        ProcessService processService = new ProcessService();
        Process[] p = processService.loadData();
        processService.printData(p,cpuTime);
        p = processService.sortProcess(p);
        boolean flag = true;

        while(flag){
            int i = p.length-1;
            while(p[i].getPcb().getAskTime()==0&&i>0){
                i--;
            }
            Process process = p[i];
            process.run();
            cpuTime++;
            p = processService.sortProcess(p);
            processService.printData(p,cpuTime);
            if(process.getPcb().getAskTime()!=0){
                process.getPcb().setState("ready");
            }

            flag = false;
            for(int j = 0;j<p.length;j++){

                flag = flag||p[j].getPcb().getAskTime()>0;
            }

        }

    }

}

