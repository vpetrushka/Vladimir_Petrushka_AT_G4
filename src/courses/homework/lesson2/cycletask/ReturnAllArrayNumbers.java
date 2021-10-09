package courses.homework.lesson2.cycletask;

public class ReturnAllArrayNumbers extends RandomArray{

    public void returnAllArrayNumbers(){


        for (int i = 0; i < getRandomArray().length; i++) {

            System.out.print(getRandomArray()[i] + " ");

        }

        System.out.println();
    }
}
