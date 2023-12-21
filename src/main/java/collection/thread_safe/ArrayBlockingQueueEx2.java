package collection.thread_safe;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx2 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(4);
        //producer
        new Thread(() -> {
            int i = 0;
            while (true) {
                try {
                    arrayBlockingQueue.put(++i);
                    System.out.println("Продюсер добавил число: " + i + arrayBlockingQueue);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        //consumer
        new Thread(() -> {
            while (true) {
                try {
                    Integer j = arrayBlockingQueue.take();
                    System.out.println("Консьюмер забрал: " + j + arrayBlockingQueue);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
