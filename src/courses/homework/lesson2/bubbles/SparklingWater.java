package courses.homework.lesson2.bubbles;

//- создать класс SparklingWater, являющийся дочерним Water
//- у газировки есть пузырьки
//- вода заполняется пузырьками при упаковке на заводе, для этого у нее есть метод pump(Bubble[] bubbles)
//- 1 литр воды содержит 10 тыс пузырьков
//- у газировки есть метод degas(), который удаляет пузырьки по одному и вызывает их лопанье

public class SparklingWater extends  Water{

    private int bubbles;

    public SparklingWater(String color, String transparency, String smell, int temperature, int bubbles ){
        super(color,transparency,smell,temperature);
        this.bubbles = bubbles;

    }

    public void pump(Bubble[] bubbles){



    }

    public void degas(){



    }
}
