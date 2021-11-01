package tasks.classwork.day9;

import tasks.classwork.day6.C;

public class Runner {
    public static void main(String[] args) {

        MyClass mc = new MyClass();
//
//        mc.justMethod(() -> Math.PI);

//        mc.justMethod(System.out::println);

        mc.justMethod(ClassX::new);

    }
}
