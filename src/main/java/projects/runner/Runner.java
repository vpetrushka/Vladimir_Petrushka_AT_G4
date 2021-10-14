package projects.runner;

import projects.objects.Bottle;

public class Runner {

    public static void main(String[] args) {

        Bottle bottleOne = new Bottle(0.5);
        Bottle bottleTwo = new Bottle(1);
        Bottle bottleThree = new Bottle(1.5);

        bottleOne.open();
        bottleTwo.open();
        bottleThree.open();

    }
}
