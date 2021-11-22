//package tasks.homework.threadtask;
//
//public class ThreadRunnerFour {
//
//    public static void main(String[] args) {
//
//        Thread t1 = new Thread(() ->
//        {
//            for (int i = 0; i < 280; i++) {
//                Mouse mouse = new Mouse(i);
//            }
//        });
//        t1.start();
//        for (int i = 0; i < 5; i++) {
//            new Thread(() ->
//                    t1.interrupt()
//            )
//        }
//
//    }
//}
