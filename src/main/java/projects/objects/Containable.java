package projects.objects;

import projects.objects.materials.Sand;

public interface Containable extends Transformable {
//-- void addStuff (Transformable stuff) - adds some stuff (e.g. water, sand) to Containable object
    default void addStuff(Transformable stuff){

    }
// -- Transformable removeStuff() - removes all stuff away
    default Transformable removeStuff(){
    return new Sand();
    }
// -- boolean isEmpty() - returns true if there is no stuff inside
    default boolean isEmpty(){
        return true;
    }
// -- int getFreeSpace() - returns an integer value of free millilitres
    default int getFreeSpace(){
        return 0;
    }
// -- void open() - forces Containable to be opened
    default void open(){

    }
    // -- void close() - forces Containable to be closed
    default void close(){

    }

}
