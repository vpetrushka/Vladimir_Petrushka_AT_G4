package tasks.homework.threadtask;


public class ThreadRunnerTaskOne {

    public static void main(String[] args) {

        for (int j = 0; j < 5; j++) {
            Thread t1 = new Thread(() -> {
                for (int i = 0; i < 20; i++) {
                    Mouse mouse = new Mouse(i);
                    mouse.peep();
                }
            });
            t1.start();
        }
    }
}