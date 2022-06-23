package service;

import bean.File;
import bean.UFD;
import bean.User;

import java.util.ArrayList;
import java.util.Scanner;

public class FileService {

    /**
     * 列文件目录
     * @param user 使用者
     */
    public void dir(User user){
        System.out.println("文件名\t"+"保护码\t"+"长度");
        for(File file:user.getUfd().getFiles()){
            System.out.println(file.getName()+"\t\t"+file.getProtect()+"\t\t"+file.getLength());
        }
    }

    /**
     * 创建文件
     * @param user 使用者
     */
    public void create(User user){
        System.out.println("请输入要创建的文件名");
        Scanner in = new Scanner(System.in);
        String fileName = in.nextLine();
        System.out.println("请输入长度");
        int length = in.nextInt();
        for(File file:user.getUfd().getFiles()){
            if(file.getName().equals(fileName)){
                System.out.println("存在相同文件名，创建失败");
                return;
            }
        }
        user.getUfd().getFiles().add(new File(fileName,111,length));
        dir(user);

    }

    /**
     * 删除文件
     * @param user 使用者
     */
    public void delete(User user){
        System.out.println("请输入要删除的文件名");
        Scanner in = new Scanner(System.in);
        String fileName =in.nextLine();
        for(File file:user.getUfd().getFiles()){
            if(file.getName().equals(fileName)){
                user.getUfd().getFiles().remove(file);
                dir(user);
                System.out.println("删除成功");
                return;
            }
        }
        return;
    }

    /**
     * 读取文件
     * @param fileName 文件名
     */
    public void read(String fileName){
        System.out.println("读取文件"+fileName+"...");
    }

    /**
     * 写入文件
     * @param fileName 文件名
     */
    public void write(String fileName){
        System.out.println("写入文件"+fileName+"...");
    }

    /**
     * 关闭文件
     * @param fileName 文件名
     * @return
     */
    public boolean close(String fileName){
        System.out.println("关闭文件"+fileName);
        return false;
    }

    /**
     * 关闭文件
     * @param user 使用者
     */
    public void open(User user){
        dir(user);
        System.out.println("选择要打开的文件");
        Scanner in = new Scanner(System.in);
        String fileName = in.nextLine();
        System.out.println("打开"+fileName+"...");
        boolean flag = true;
        while (flag){
            System.out.println("对文件进行操作");
            System.out.println("1.读文件");
            System.out.println("2.写文件");
            System.out.println("3.关闭文件");

            int choice = in.nextInt();
            switch (choice){
                case 1:
                    read(fileName);
                    break;
                case 2:
                    write(fileName);
                    break;
                case 3:
                    flag = close(fileName);
                    break;
                default:
                    System.out.println("请输入正确数字");
            }
        }
    }

    /**
     * 加载文件
     * @return 文件
     */
    public UFD loadData(){
        File f1 = new File("f1",111,1);
        File f2 = new File("f2",111,2);
        File f3 = new File("f3",111,3);
        ArrayList<File> files = new ArrayList<>();
        files.add(f1);
        files.add(f2);
        files.add(f3);

        return new UFD(files);
    }
}
