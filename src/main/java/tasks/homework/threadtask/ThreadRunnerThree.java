package tasks.homework.threadtask;

public class ThreadRunnerThree {

    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            new Thread(() ->
            {
                for (int j = 0; j < 26; j++) {
                    Mouse mouse = new Mouse(j);
                    if (j % 2 != 0) {
                        mouse.peep();
                    }
                }
            }).start();
        }
    }
}
