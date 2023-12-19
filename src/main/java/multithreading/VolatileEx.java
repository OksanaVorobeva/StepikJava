package multithreading;

public class VolatileEx extends Thread{

    volatile boolean b=true;

    @Override
    public void run() {
        long counter=0;
        while (b){
            counter++;
        }
        System.out.println("Loop is finished. counter = "+counter);
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileEx volatileEx= new VolatileEx();
        volatileEx.start();
        Thread.sleep(300);
        System.out.println("After 3 second it is time to wake up!");
        volatileEx.b=false;
        volatileEx.join();
        System.out.println("End of programm");
    }
}
