package bean;

import java.util.ArrayList;

public class MFD {
    private ArrayList<User> users;

    public MFD(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}
