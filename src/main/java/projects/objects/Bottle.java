package projects.objects;

//- создать класс Bottle
//- у него есть обьем
//- есть вода
//- есть метод open(), который вызывает метод degas() в газировке

import projects.liquid.Water;

public class Bottle {

    private Water water;
    private double volume;

    public Bottle(double volume){
        this.volume = volume;
    }

    public void open(){

    }
}
