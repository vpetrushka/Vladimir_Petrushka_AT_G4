package projects.liquid;

//- создать класс SparklingWater, являющийся дочерним Water
//- у газировки есть пузырьки
//- вода заполняется пузырьками при упаковке на заводе, для этого у нее есть метод pump(Bubble[] bubbles)
//- 1 литр воды содержит 10 тыс пузырьков
//- у газировки есть метод degas(), который удаляет пузырьки по одному и вызывает их лопанье

import projects.objects.Bubble;

public class SparklingWater extends Water {

    private Bubble[] bubbles;
    private boolean isOpened;

    public SparklingWater(String color, String transparency, String smell, int temperature) {
        super(color, transparency, smell, temperature);

    }
//есть публичный метод void pump(Bubble[] bubbles), который сетает массив из пузырьков в воду
    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
        
    }
//есть публичный метод void setOpened(boolean isOpened), который меняет состояние воды на "открытое"
    public void setOpened(boolean isOpened) {

    }
    //есть приватный метод void isOpened(), который в новом потоке проверят состояние воды на "открытость" и в случае,
    // если она открыта запускает метод degas()
    private void isOpened(){

    }
    //есть приватный метод degas(), который каждую секунду выпускает по партии пузырьков из рассчета 10 + 5 * температура_воды
    private void degas() {

    }

    //есть публичный метод boolean isSparkle(), возвращающий true если в воде еще есть пузырьки газа
    public boolean isSparkle(){

        return true;
    }

}
