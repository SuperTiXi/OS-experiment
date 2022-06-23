package bean;

public class Page {
    private int num;
    private int flag;
    private int memoryNum;
    private int diskNum;
    private int isModify;

    public Page(int num, int flag, int memoryNum, int diskNum, int isModify) {
        this.num = num;
        this.flag = flag;
        this.memoryNum = memoryNum;
        this.diskNum = diskNum;
        this.isModify = isModify;
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

    public int getIsModify() {
        return isModify;
    }

    public void setIsModify(int isModify) {
        this.isModify = isModify;
    }
}
