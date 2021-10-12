package tasks.homework.cycletask;

public class ReturnLowestNumberFromArray extends RandomArray{

    public void returnLowestNumberFromArray(){

        int[] randomArray = getRandomArray();

        int lowestNumber = randomArray[0];

        for (int i = 1; i < randomArray.length; i++) {

            if(randomArray[i] < lowestNumber){
                lowestNumber = randomArray[i];
            }

        }

        System.out.println(lowestNumber);
    }
}
