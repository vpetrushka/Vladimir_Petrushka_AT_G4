package courses.homework.lesson2.basetask;

//-- строковое поле description
//-- строковое поле severity
//-- конструктор, принимающий описание и важность и инициализирующий соответствующие поля
//-- геттеры и сеттеры на каждое поле
//-- невозвратный метод printObstacleDetails, который печатает в консоль информацию о трудности в виде "Возникло <важность> препятствиие <описание препятствия>"

public class Obstacle {

    private String description;
    private String severity;

    public Obstacle(String description, String severity){
        this.description = description;
        this.severity = severity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public void printObstacleDetails(){
        System.out.println("Возникло " + getSeverity() + " препятствие " + getDescription());
    }
}
