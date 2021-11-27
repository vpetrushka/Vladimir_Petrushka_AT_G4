package projects.vessel;

import projects.material.Material;
import projects.stuff.Transformable;

public class Cup extends Vessel implements Containable {
    public Cup(double volume, double parameter, Material material) {
        super(volume, parameter, material);
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
