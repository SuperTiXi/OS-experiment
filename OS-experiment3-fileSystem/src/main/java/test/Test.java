package test;

import bean.MFD;
import bean.User;
import service.FileService;
import service.UserService;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        FileService fileService = new FileService();
        UserService userService = new UserService();
        User user = new User();
        //初始化数据
        MFD mfd = userService.loadData(fileService.loadData());
        System.out.println("请先登录");
        Scanner in  = new Scanner(System.in);
        String userName = in.nextLine();
        if(userService.login(userName,mfd)){
            user = userService.findUser(userName,mfd);
        }
        boolean flag = true;
        while (flag){
            System.out.println("dir:查看文件目录");
            System.out.println("create:创建文件");
            System.out.println("delete:删除文件");
            System.out.println("open:打开文件");
            System.out.println("exit:退出");

            String choice = in.nextLine();
            switch (choice){
                case "dir":
                    fileService.dir(user);
                    break;
                case "create":
                    fileService.create(user);
                    break;
                case  "delete":
                    fileService.delete(user);
                    break;
                case "open":
                    fileService.open(user);
                    break;
                case "exit":
                    flag = false;
                    break;
                default:
                    System.out.println("输入正确指令");
            }
        }
    }
}
