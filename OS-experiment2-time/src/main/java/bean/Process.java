package bean;

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

            int temp = this.pcb.getRunTime()+1;
            this.pcb.setRunTime(temp);

            if (this.pcb.getAskTime() == this.pcb.getRunTime()) {
                this.pcb.setState("finish");
            }
        }
    }
}
