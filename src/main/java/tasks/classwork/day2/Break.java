package tasks.classwork.day2;

public class Break {

    public void breaking() {

        int i = 23;
        while (i < 28) {
            if (i % 13 == 0) {
                System.out.println("continue!");
                break;
            }
            System.out.println("i is : " + i++);
        }
        System.out.println("i is : " + i);
    }

}

