package courses.homework.lesson2.cycletask;

public class ChangeArrayFirstAndLast extends RandomArray{

    public void changeArrayFirstAndLast(){

        int temp = 0;

        temp = getRandomArray()[0];

        getRandomArray()[0] = getRandomArray()[getRandomArray().length-1];

        getRandomArray()[getRandomArray().length-1] = temp;

        for (int i = 0; i < getRandomArray().length; i++) {

            System.out.print(getRandomArray()[i] + " ");

        }

        System.out.println();

    }

}
