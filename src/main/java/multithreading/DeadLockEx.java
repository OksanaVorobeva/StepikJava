package multithreading;

public class DeadLockEx {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Tread10 tread10=new Tread10();
        Tread20 tread20 =new Tread20();

        tread10.start();
        tread20.start();
    }
}

class Tread10 extends Thread {
    @Override
    public void run() {
        System.out.println("Tread10: Попытка захватить монитор обьека lock1");
        synchronized (DeadLockEx.lock1) {
            System.out.println("Tread10: монитор обьека lock1 захвачен");
            System.out.println("Tread10: Попытка захватить монитор обьека lock2");
            synchronized (DeadLockEx.lock2) {
                System.out.println("Tread10: монитор обьека lock1 и lock2 захвачен");
            }
        }
    }
}


class Tread20 extends Thread {
    @Override
    public void run() {
        System.out.println("Tread20: Попытка захватить монитор обьека lock2");
        synchronized (DeadLockEx.lock2) {
            System.out.println("Tread20: монитор обьека lock2 захвачен");
            System.out.println("Tread20: Попытка захватить монитор обьека lock2");
            synchronized (DeadLockEx.lock1) {
                System.out.println("Tread20: монитор обьека lock1 и lock2 захвачен");
            }
        }
    }
}
