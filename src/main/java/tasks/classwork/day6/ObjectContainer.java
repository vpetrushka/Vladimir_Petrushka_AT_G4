package tasks.classwork.day6;

public class ObjectContainer {

    Object[] objects = new Object[10];
    int freePlaceNumber;


    public void add(Object o) {
        if (freePlaceNumber < objects.length) {
            objects[freePlaceNumber++] = o;
        }
    }

    public Object removeLast() {
        if (freePlaceNumber > 0) {
            Object returnable = objects[freePlaceNumber - 1];
            objects[freePlaceNumber - 1] = null;
            freePlaceNumber--;
            return returnable;
        }
        else
            return null;
    }

    public boolean isEmpty() {
        return freePlaceNumber == 0;

    }

    public boolean isFull() {
        return freePlaceNumber == objects.length;
    }

}
