package tasks.homework.basetask;

//-- строковое поле name
//-- целочисленное поле age
//-- конструктор, принимающий имя и возраст и инициализирующий соответствующие поля
//-- геттеры и сеттеры на каждое поле
//-- невозвратный метод printMouseDetails, который печатает в консоль информацию о мыши в виде "Я мышь, меня зовут <имя мыши> и мне <возраст мыши> лет"

public class Mouse {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Mouse(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void printMouseDetails(){
        System.out.println("Я мышь, меня зовут " + name + " и мне " + age +"лет");
    }
}