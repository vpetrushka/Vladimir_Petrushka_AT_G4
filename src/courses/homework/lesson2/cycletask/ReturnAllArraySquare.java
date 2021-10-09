package courses.homework.lesson2.cycletask;

public class ReturnAllArraySquare extends RandomArray {

    public void returnAllArraySquare(){

        for (int i = 0; i < getRandomArray().length; i++) {

            System.out.print(getRandomArray()[i]* getRandomArray()[i] + " ");

        }

        System.out.println();

    }
}
