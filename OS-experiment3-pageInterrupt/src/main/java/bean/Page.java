package bean;

public class Page {
    private int num;
    private int flag;
    private int memoryNum;
    private int diskNum;

    public Page(int num, int flag, int memoryNum, int diskNum) {
        this.num = num;
        this.flag = flag;
        this.memoryNum = memoryNum;
        this.diskNum = diskNum;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getMemoryNum() {
        return memoryNum;
    }

    public void setMemoryNum(int memoryNum) {
        this.memoryNum = memoryNum;
    }

    public int getDiskNum() {
        return diskNum;
    }

    public void setDiskNum(int diskNum) {
        this.diskNum = diskNum;
    }
}
