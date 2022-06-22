package bean;

import java.util.Vector;

public class MyNumber {
    //创建一个栈,后进先出
    Vector<Integer> vector=new Vector<Integer>();

    public synchronized Integer pop(){
        Integer reInt = null;
        while(vector.size()==0){
            try{
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        reInt=vector.remove(vector.size()-1);
        return reInt;
    }

    public synchronized void push(int num){
        this.notify();
        Integer number=new Integer(num);
        vector.addElement(number);
    }
}
