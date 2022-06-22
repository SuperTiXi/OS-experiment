package test;

import bean.Consumer;
import bean.MyNumber;
import bean.Producer;

public class Test {
    public static void main(String[] args) {
        MyNumber myNumber=new MyNumber();

        Thread pt1=new Thread(new Producer(myNumber));
        Thread ct1=new Thread(new Consumer(myNumber));

        pt1.start();
        ct1.start();

    }
}
