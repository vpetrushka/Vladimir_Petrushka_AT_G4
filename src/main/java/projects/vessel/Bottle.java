package projects.vessel;

import projects.stuff.SparklingWater;
import projects.stuff.Transformable;
import projects.objects.materials.Material;


public class Bottle extends Vessel implements Containable {

    private SparklingWater water;
    private double volume;

    //содержит конструктор Bottle(double volume), в котором бутылка заполняется массивом из пузырьков из рассчета 10000 на каждый литр
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

    //есть публичный метод setWater(SparklingWater water) добавляющий новый обьект воды
    public SparklingWater setWater(SparklingWater water) {
        return new SparklingWater(water.getColor(), "2", "3", 330);
    }

}
