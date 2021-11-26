package projects.vessel;

import projects.stuff.Transformable;

public interface Containable{

    void addStuff (Transformable stuff);
    Transformable removeStuff();
    boolean isEmpty();
    int getFreeSpace();
    void open();
    void close();
    void warm(int temperature);
}