package tasks.classwork.day8;

import java.util.ArrayList;
import java.util.List;

public class Vegetables {
    public static void main(String[] args) {
        List<String> vegetables = new ArrayList<>();
        vegetables.add("Помидор");
        vegetables.add("Огурец");
        vegetables.add("Кабачок");
        vegetables.add("Батат");
        vegetables.add("Картоха");

        for (String x : vegetables) {
            System.out.print(x + " ");
        }
        System.out.println();
        int counter = 0;


        for (String x : vegetables) {
            if (x.contains("а")) {
                counter++;
            }
        }

        System.out.println(counter);

        for (int i = 0; i < vegetables.size(); i++) {
            System.out.print(vegetables.get(i) + " ");
        }

        System.out.println();
        vegetables.remove("Огурец");
        vegetables.remove(3);

        for (String x : vegetables) {
            System.out.print(x + " ");
        }
    }
}
