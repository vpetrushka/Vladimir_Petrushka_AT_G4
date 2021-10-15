package projects.objects;

import projects.liquid.SparklingWater;
import projects.liquid.Water;

public class Bottle {

    private SparklingWater water;
    private double volume;

    //содержит конструктор Bottle(double volume), в котором бутылка заполняется массивом из пузырьков из рассчета 10000 на каждый литр
    public Bottle(double volume) {
        this.volume = volume;
        double bubbleVolume = volume * 10000;
    }

    //есть публичный метод void open(), который меняет состояние воды в "открытое" (приблизительно, как this.water.setOpened(true);)
    public void open() {

    }

    //------ есть публичный метод void warm(int temperature), который устанавливает температуру воды в бутылке
    public void warm(int temperature) {
        water.setTemperature(temperature);
    }

    //------ есть публичный метод SparklingWater getWater() возвращающий обьект воды
    public SparklingWater getWater() {

        return new SparklingWater(water.getColor(), water.getTransparency(), water.getSmell(), water.getTemperature());
    }

    //есть публичный метод setWater(SparklingWater water) добавляющий новый обьект воды
    public SparklingWater setWater(SparklingWater water) {
        return new SparklingWater(water.getColor(), "2", "3", 330);
    }

}
