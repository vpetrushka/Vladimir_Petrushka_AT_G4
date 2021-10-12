package tasks.homework.cycletask;

public class ReturnAllArraySquare extends RandomArray {

    public void returnAllArraySquare(){

        int[] randomArray = getRandomArray();

        for (int i = 0; i < randomArray.length; i++) {

            System.out.print(randomArray[i]* randomArray[i] + " ");

        }

        System.out.println();

    }
}