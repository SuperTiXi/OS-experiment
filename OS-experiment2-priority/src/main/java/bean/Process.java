package bean;

import bean.PCB;

public class Process extends Thread{
    private PCB pcb;

    public PCB getPcb() {
        return pcb;
    }

    public void setPcb(PCB pcb) {
        this.pcb = pcb;
    }

    @Override
    public void run() {
        if(this.pcb.getState().equals("finish")){
            return;
        }
        else {
            this.pcb.setState("working");

            int temp = this.pcb.getPriority() - 1;
            this.pcb.setPriority(temp);

            int temp1 = this.pcb.getAskTime() - 1;
            this.pcb.setAskTime(temp1);

            if (this.pcb.getAskTime() == 0) {
                this.pcb.setState("finish");
            }
        }
    }
}
