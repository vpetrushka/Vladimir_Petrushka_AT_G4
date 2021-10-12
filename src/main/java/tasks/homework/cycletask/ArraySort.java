package tasks.homework.cycletask;

public class ArraySort extends RandomArray{

    public void arraySort(){

        int[] sorting = getRandomArray();

        boolean needIteration = true;

        while(needIteration) {
            needIteration = false;
            for (int i = 0; i < sorting.length-1; i++)
                if (sorting[i] > sorting[i + 1]) {
                    int temp;
                    temp = sorting[i];
                    sorting[i] = sorting[i + 1];
                    sorting[i + 1] = temp;
                    needIteration = true;
                }
        }

        for (int i = 0; i < sorting.length; i++) {
            System.out.print(sorting[i] + " ");
        }

    }
}
