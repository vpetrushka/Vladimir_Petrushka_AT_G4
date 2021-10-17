package tasks.classwork.day6;

import java.util.Random;

public class ObjectContainerRunner {
    public static void main(String[] args) {

        ObjectContainer objectContainer = new ObjectContainer();
        Random random = new Random();

        while (!objectContainer.isFull()) {
            objectContainer.add(random.nextInt(100));
            objectContainer.add("Hello");
        }

        while (!objectContainer.isEmpty()){
            System.out.println(objectContainer.removeLast());
        }

    }

}