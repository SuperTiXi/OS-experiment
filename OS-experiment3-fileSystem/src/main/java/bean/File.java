package bean;

public class File {
    private String name;
    private int protect;
    private int length;

    public File(String name, int protect, int length) {
        this.name = name;
        this.protect = protect;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProtect() {
        return protect;
    }

    public void setProtect(int protect) {
        this.protect = protect;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
