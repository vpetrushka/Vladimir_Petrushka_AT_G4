package tasks.homework.basetask;

//-- создать метод processMouse, который принимает на вход обьект мыши (Mouse)
// и печатает в консоль ее имя, возраст и вызывающий метод printMouseDetails
//-- создать метод processSouce, который принимает на вход обьект соуса (Souce) и печатает в консоль его имя, цвет и вызывающий метод printSouceDetails
//-- создать метод processBee, который принимает на вход обьект пчелы (Bee)
// и печатает в консоль ее пол, вес и вызывающий метод printBeeDetails
//-- создать метод processObstacle, который принимает на вход обьект препятствия (Obstacle) и печатает в консоль его описание, важность и вызывающий метод printObstacleDetails
//-- создать метод processPineapple, который принимает на вход обьект ананаса (Pineapple)
// и печатает в консоль его сорт, теплоемкость и вызывающий метод printPineappleDetails
//-- создать в раннере TrainMethodsObjectsRunner обьект класса TrainMethodsObjects, и вызвать всего его методы

public class TrainMethodsObjects {

    public void processMouse(Mouse mouse){
        System.out.println(mouse.getName() + " " + mouse.getAge());
        mouse.printMouseDetails();
    }

    public void processSouce(Souce souce){
        System.out.println(souce.getName() + " " + souce.getColor());
        souce.printSouceDetails();
    }

    public void processBee(Bee bee){
        System.out.println(bee.getGender() + " " + bee.getGender());
        bee.printBeeDetails();
    }

    public void processObstacle(Obstacle obstacle){
        System.out.println(obstacle.getDescription() + " " + obstacle.getSeverity());
        obstacle.printObstacleDetails();
    }

    public void processPineapple(Pineapple pineapple){
        System.out.println(pineapple.getGrade() + " " + pineapple.getHeatCapacity());
        pineapple.printPineappleDetails();
    }

}
