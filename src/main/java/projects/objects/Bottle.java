package projects.objects;

import projects.liquid.SparklingWater;
import projects.liquid.Water;

public class Bottle {

    private SparklingWater water;
    private double volume;
//содержит конструктор Bottle(double volume), в котором бутылка заполняется массивом из пузырьков из рассчета 10000 на каждый литр
    public Bottle(double volume){
        this.volume = volume;
    }
//есть публичный метод void open(), который меняет состояние воды в "открытое" (приблизительно, как this.water.setOpened(true);)
    public void open(){

    }
    //------ есть публичный метод void warm(int temperature), который устанавливает температуру воды в бутылке
    public void warm(int tempareture){

    }
//------ есть публичный метод SparklingWater getWater() возвращающий обьект воды
    public Water getWater(){

        return new SparklingWater("2","2","3",20);
    }
//есть публичный метод setWater(SparklingWater water) добавляющий новый обьект воды
    public Water setWater(SparklingWater water){
        return new SparklingWater("2","2","3",330);
    }

}
