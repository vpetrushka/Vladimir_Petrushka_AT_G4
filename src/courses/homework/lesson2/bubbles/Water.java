package courses.homework.lesson2.bubbles;
//- создать абстрактный класс Water
//- у воды есть такие характеристики, цвет, прозрачность, запах, температура
public abstract class Water {

    private String color;
    private String transparency;
    private String smell;
    private int temperature;

    public Water(String color, String transparency, String smell, int temperature){

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransparency() {
        return transparency;
    }

    public void setTransparency(String transparency) {
        this.transparency = transparency;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
