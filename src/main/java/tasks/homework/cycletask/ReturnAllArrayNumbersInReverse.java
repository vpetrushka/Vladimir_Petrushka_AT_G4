package tasks.homework.cycletask;

public class ReturnAllArrayNumbersInReverse extends RandomArray{

    public void returnAllArrayNumbersInReverse(){

        int[] randomArray = getRandomArray();

        for (int i = randomArray.length-1; i >= 0; i--) {

            System.out.print(randomArray[i] + " ");

        }

        System.out.println();
    }

}
