package bean;

public class PCB {
    private String name;
    private int askTime;
    private int runTime = 0;
    private String state = "ready";

    public PCB(String name, int askTime) {
        this.name = name;
        this.askTime = askTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAskTime() {
        return askTime;
    }

    public void setAskTime(int askTime) {
        this.askTime = askTime;
    }

    public int getRunTime() {
        return runTime;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "PCB{" +
                "name='" + name + '\'' +
                ", askTime=" + askTime +
                ", runTime=" + runTime +
                ", state='" + state + '\'' +
                '}';
    }
}
