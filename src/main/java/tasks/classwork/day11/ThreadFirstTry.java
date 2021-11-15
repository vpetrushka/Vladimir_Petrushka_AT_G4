package tasks.classwork.day11;

public class ThreadFirstTry {

    public static void main(String[] args) {

        Thread thread = new Thread(() -> System.out.println("Hello"));

        thread.start();

    }
}