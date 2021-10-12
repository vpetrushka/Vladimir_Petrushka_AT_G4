package tasks.homework.cycletask;

public class ReturnAllArrayNumbers extends RandomArray{

    public void returnAllArrayNumbers(){

        int[] randomArray = getRandomArray();

        for (int i = 0; i < randomArray.length; i++) {

            System.out.print(randomArray[i] + " ");

        }

        System.out.println();
    }
}
