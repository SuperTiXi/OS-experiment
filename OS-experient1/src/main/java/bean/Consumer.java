package bean;

public class Consumer extends Thread{
    private MyNumber myNumber;
    private int num=0;
    private static int counter=1;
    public Consumer(MyNumber number){
        this.myNumber=number;
        num=counter++;
    }
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            int figure=myNumber.pop();
            System.out.println("Consumer "+num+"消费"+figure);
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}