package tasks.homework.cycletask;

public class ReturnAllArrayNumbersByFive extends RandomArray{

    public void returnAllArrayNumberByFive(){

        int[] randomArray = getRandomArray();

        for (int i = 0; i < randomArray.length; i++) {

            System.out.print(randomArray[i]*5 + " ");
        }

        System.out.println();
    }
}
