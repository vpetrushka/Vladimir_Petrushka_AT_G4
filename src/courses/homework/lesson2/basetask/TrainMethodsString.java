package courses.homework.lesson2.basetask;

//-- создать невозвратный метод printMama, который ничего не принимает на вход печатает в консоль «мама мыла раму»
//-- создать невозвратный метод printPapa, который ничего не принимает на вход печатает в консоль «папа мыла раму»
//-- создать невозвратный метод printString, который принимает на вход строку и печатает в консоль эту строку
//-- создать невозвратный метод printMamaString, который принимает на вход строку и печатает в консоль «мама мыла » и эту строку
//-- создать в раннере TrainMethodsStringRunner обьект класса TrainMethodsString и вызвать всего его методы

public class TrainMethodsString {

    private String inputString;

    public void printMama(){
        System.out.println("мама мыла раму");
    }

    public void printPapa(){
        System.out.println("папа мыла раму");
    }

    public void printString(String inputString){
        this.inputString = inputString;
        System.out.println(inputString);
    }

    public void printMamaString(String inputString){
        this.inputString = inputString;
        System.out.println("мама мыла " + inputString);
    }
}
