package tasks.classwork.day6;

public class GenericContainer<T> {

    private final T[] objects;
    private int freePlaceNumber;

    public GenericContainer() {
        objects = (T[]) new Object[10];
        freePlaceNumber = 0;
    }

    public void add(T o) {
        if (freePlaceNumber < objects.length) {
            objects[freePlaceNumber++] = o;
        }
    }

    public T removeLast() {
        if (freePlaceNumber > 0) {
            T returnable = objects[freePlaceNumber - 1];
            objects[freePlaceNumber - 1] = null;
            freePlaceNumber--;
            return returnable;
        } else
            return null;
    }

    public boolean isEmpty() {
        return freePlaceNumber == 0;

    }

    public boolean isFull() {
        return freePlaceNumber == objects.length;
    }

}
