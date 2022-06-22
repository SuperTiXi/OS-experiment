package bean;

public class PCB {
    private String name;
    private int askTime;
    private int priority;
    private String state = "ready";

    public PCB(String name, int askTime, int priority) {
        this.name = name;
        this.askTime = askTime;
        this.priority = priority;
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

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
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
                ", priority=" + priority +
                ", state='" + state + '\'' +
                '}';
    }
}
