package multithreading;

public class Ex5 {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        myThread5.setName("my_potok");
        myThread5.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Name of myTread5 = " + myThread5.getName() +
                " Priority of myTread5 = " + myThread5.getPriority());

        MyThread5 myThread6 = new MyThread5();
        System.out.println("Name of myTread6 = " + myThread6.getName() +
                " Priority of myTread6 = " + myThread6.getPriority());

    }
}

class MyThread5 extends Thread {
    @Override
    public void run() {
        System.out.println("privet");
    }
}
