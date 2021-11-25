package tasks.homework.threadtask;
//1.2
//- создать 7 потоков, в каждом из которых:
//-- создать коллекцию из 18 мышей
//-- проитерировать коллекцию и пикнуть каждой четной мышью
//- запустить потоки

public class ThreadRunnerTaskTwo {

    public static void main(String[] args) {

        for (int i = 0; i < 7; i++) {
            new Thread(() ->
            {
                for (int j = 0; j < 18; j++) {
                    Mouse mouse = new Mouse(j);
                    if (j % 2 == 0) {
                        mouse.peep();
                    }
                }
            }).start();
        }
    }
}
