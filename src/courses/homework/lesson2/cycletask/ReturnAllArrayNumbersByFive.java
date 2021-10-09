package courses.homework.lesson2.cycletask;

public class ReturnAllArrayNumbersByFive extends RandomArray{

    public void returnAllArrayNumberByFive(){

        for (int i = 0; i < getRandomArray().length; i++) {

            System.out.print(getRandomArray()[i]*5 + " ");
        }

        System.out.println();
    }
}
