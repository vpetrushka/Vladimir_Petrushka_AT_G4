package tasks.homework.cycletask;

import java.util.Random;

//- создать пустой массив типа int и размера n = 7 и заполнить его случайными элементами используя Random.nextInt(n)
public class RandomArray {

    public int[] getRandomArray() {

        int[] createArray = new int[7];

        Random random = new Random();

        for (int i = 0; i < createArray.length; i++) {

            createArray[i] = random.nextInt(100);

        }

        return createArray;

    }

}