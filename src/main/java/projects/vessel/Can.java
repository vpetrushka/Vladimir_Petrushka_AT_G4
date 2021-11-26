package projects.vessel;

import projects.objects.materials.Material;
import projects.stuff.Transformable;


public class Can extends Vessel implements Containable {

    public Can(double volume, double parameter, int weight, Material material) {
        super(volume, parameter, weight, material);
    }

    @Override
    public void addStuff(Transformable stuff) {

    }

    @Override
    public Transformable removeStuff() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getFreeSpace() {
        return 0;
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void warm(int temperature) {

    }
}
