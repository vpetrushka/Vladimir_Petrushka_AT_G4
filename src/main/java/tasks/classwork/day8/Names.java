package tasks.classwork.day8;

import java.util.ArrayList;
import java.util.List;

public class Names {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Оля");
        names.add("Коля");
        names.add("Аня");
        names.add("Миша");
        names.add("Даша");

        for (String x : names) {
            System.out.print(x + " ");
        }
        System.out.println();
        names.set(2, "Вася");
        names.set(4, "Жора");

        for (String x : names) {
            System.out.print(x + " ");
        }
        System.out.println();
        names.remove("Оля");
        names.remove(3);

        for (String x : names) {
            System.out.print(x + " ");
        }
    }
}
