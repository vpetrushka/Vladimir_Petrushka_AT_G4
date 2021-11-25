package projects.vessel;

import projects.stuff.SparklingWater;
import projects.stuff.Transformable;
import projects.objects.materials.Material;


public class Bottle extends Vessel implements Containable {

    private SparklingWater water;
    private double volume;
    private final double BOTTLEDIAMETER = 2.0;

    public Bottle(double volume, double parameter, int weight, Material material) {
        super();
        double bubbleVolume = volume * 10000;
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

    public void open() {
        this.water.setOpened(true);
    }

    @Override
    public void close() {
        this.water.setOpened(false);
    }

    public void warm(int temperature) {
        water.setTemperature(temperature);
    }

    public SparklingWater getWater() {

        return new SparklingWater(water.getColor(), water.getTransparency(), water.getSmell(), water.getTemperature());
    }

    public SparklingWater setWater(SparklingWater water) {
        return new SparklingWater(water.getColor(), water.getTransparency(), water.getSmell(), water.getTemperature());
    }

}
