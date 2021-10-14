package projects.liquid;

//- создать класс SparklingWater, являющийся дочерним Water
//- у газировки есть пузырьки
//- вода заполняется пузырьками при упаковке на заводе, для этого у нее есть метод pump(Bubble[] bubbles)
//- 1 литр воды содержит 10 тыс пузырьков
//- у газировки есть метод degas(), который удаляет пузырьки по одному и вызывает их лопанье

import projects.objects.Bubble;

public class SparklingWater extends  Water{

    private Bubble[] bubbles;

    public SparklingWater(String color, String transparency, String smell, int temperature ){
        super(color,transparency,smell,temperature);

    }

    public void pump(Bubble[] bubbles){
        this.bubbles = bubbles;

    }

    public void degas(){

    }
}
