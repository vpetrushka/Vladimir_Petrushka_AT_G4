package tasks.classwork.day11;

import java.util.stream.IntStream;

import static java.lang.Math.atan;
import static java.lang.Math.tan;

public class ThreeThreads {

    public static void main(String[] args) throws InterruptedException {
//
//        Thread t1 = new Thread(() -> IntStream.range(0, 100).forEach(x -> {
//            System.out.println("t1 " + x);
//            Thread.yield();
//        }));
//
//        Thread t2 = new Thread(() -> IntStream.range(0, 100).forEach(x -> System.out.println("t2 " + x)));
//        Thread t3 = new Thread(() -> IntStream.range(0, 100).forEach(x -> System.out.println("t3 " + x)));
//
//        t1.start();
//        t2.start();
//        t3.start();
//
//        for (int i = 0; i < 5; i++) {
//            heavyMethod();
////        }
//
//        for (int i = 0; i < 5; i++) {
//            new Thread(ThreeThreads::heavyMethod).start();
//        }

        Thread t1 = new Thread(()-> heavyMethod());
        Thread t2 = new Thread(()-> heavyMethod());
        Thread t3 = new Thread(()-> {
            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            heavyMethod();
        });


        t1.start();

        t2.start();

        t3.start();

    }

    public static void heavyMethod() {
        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            double d = tan(atan(123456789.123456789));
        }
        System.out.printf("I am %s ,and I have finished in %s milis \r\n",
                Thread.currentThread().getName(),
                (System.currentTimeMillis() - t0));
    }
}
