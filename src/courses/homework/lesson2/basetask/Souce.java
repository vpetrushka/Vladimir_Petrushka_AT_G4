package courses.homework.lesson2.basetask;
//-- строковое поле name
//-- строковое поле color
//-- конструктор, принимающий имя и цвет и инициализирующий соответствующие поля
//-- геттеры и сеттеры на каждое поле
//-- невозвратный метод printSouceDetails, который печатает в консоль информацию о соусе в виде "Это соус <имя соуса> <цвет соуса> цвета"


public class Souce {

    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Souce(String name, String color){
        this.name =name;
        this.color = color;

    }

    public void printSouceDetails(){
        System.out.println("Это соус " + getName() + " " + getColor() + " цвета");
    }
}
