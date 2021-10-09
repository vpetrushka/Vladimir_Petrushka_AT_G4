package courses.lesson02;

public class Returning {

    public void returning() {

        int i;

        for (i = 23; i < 28; i++) {
            if (i % 13 == 0) {
                System.out.println("continue!");
                return;
            }
            System.out.println("i is : " + i);
        }
        System.out.println("i is : " + i);

    }

}

