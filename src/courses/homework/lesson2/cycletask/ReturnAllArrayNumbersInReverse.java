package courses.homework.lesson2.cycletask;

public class ReturnAllArrayNumbersInReverse extends RandomArray{

    public void returnAllArrayNumbersInReverse(){

        for (int i = getRandomArray().length-1; i >= 0; i--) {

            System.out.print(getRandomArray()[i] + " ");

        }

        System.out.println();
    }

}
