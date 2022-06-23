package service;

import bean.MFD;
import bean.UFD;
import bean.User;

import java.util.ArrayList;

public class UserService {

    /**
     * 登陆函数
     * @param name 用户名
     * @param mfd 用户列表
     * @return 是否成功
     */
    public boolean login(String name,MFD mfd){
        for(User user: mfd.getUsers()){
            if(user.getName().equals(name)){
                return true;
            }
        }
        return false;
    }

    /**
     * 根据name找user
     * @param name
     * @param mfd
     * @return
     */
    public User findUser(String name,MFD mfd){
        for(User user: mfd.getUsers()){
            if(user.getName().equals(name)){
                return user;
            }
        }
        return null;
    }

    /**
     * 加载数据
     * @param ufd
     * @return
     */
    public MFD loadData(UFD ufd){
        User user = new User("1",ufd);
        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        MFD mfd = new MFD(users);
        return mfd;
    }
}
