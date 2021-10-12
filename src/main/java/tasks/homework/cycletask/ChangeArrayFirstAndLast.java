package tasks.homework.cycletask;

public class ChangeArrayFirstAndLast extends RandomArray{

    public void changeArrayFirstAndLast(){

        int[] randomArray = getRandomArray();
        int temp;

        temp = randomArray[0];

        randomArray[0] = randomArray[randomArray.length-1];

        randomArray[randomArray.length-1] = temp;

        for (int j : randomArray) {

            System.out.print(j + " ");

        }

        System.out.println();
    }
}
