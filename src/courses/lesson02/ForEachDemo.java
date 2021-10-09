package courses.lesson02;

import java.util.Random;

public class ForEachDemo {

    public void makeAverage() {
        int sum = 0;
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        for (int i: array) {
            sum += i;
        }

        System.out.println("Average value is: " + sum / array.length);

    }
}
