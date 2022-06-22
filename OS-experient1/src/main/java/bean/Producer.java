package bean;

import java.util.Random;

public class Producer extends Thread{
    private MyNumber myNumber;
    private int num=0;
    private static int counter=1;
    public Producer(MyNumber number){
        this.myNumber=number;
        num=counter++;
    }
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            int figure=new Random().nextInt(10);
            myNumber.push(figure);
            System.out.println("Producer "+num+"生产"+figure);
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
