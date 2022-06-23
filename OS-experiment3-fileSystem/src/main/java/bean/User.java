package bean;

public class User {
    private String name;
    private UFD ufd;

    public User(String name) {
        this.name = name;
    }

    public User() {
    }

    public User(String name, UFD ufd) {
        this.name = name;
        this.ufd = ufd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UFD getUfd() {
        return ufd;
    }

    public void setUfd(UFD ufd) {
        this.ufd = ufd;
    }
}
