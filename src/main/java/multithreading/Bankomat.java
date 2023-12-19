package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Employee("1", lock);
        new Employee("2", lock);
        new Employee("3", lock);
        new Employee("4", lock);
        new Employee("5", lock);
    }
}

class Employee extends Thread {
    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " ждет... ");
            lock.lock();
            System.out.println(name + " пользуется банкоматом");
            Thread.sleep(2000);
            System.out.println(name + " завершил свои дела");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }
}