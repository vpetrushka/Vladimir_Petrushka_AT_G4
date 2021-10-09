package courses.homework.lesson2.cycletask;

public class ReturnLowestNumberFromArray extends RandomArray{

    public void returnLowestNumberFromArray(){

        int lowestNumber = getRandomArray()[0];

        for (int i = 1; i < getRandomArray().length; i++) {

            if(getRandomArray()[i] < lowestNumber){
                lowestNumber = getRandomArray()[i];
            }

        }

        System.out.println(lowestNumber);
    }
}
