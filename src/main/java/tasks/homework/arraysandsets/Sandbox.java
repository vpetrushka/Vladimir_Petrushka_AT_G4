package tasks.homework.arraysandsets;

//Создать пустой список песка (класса Sand) sandbox
//Заполнить 4 обьектами песка с весом (2, 4, 2, 7) и именами (Речной, Речной, Карьерный, Речной) соответственно
//Проитерировать список через for-each и отпечатать вес в консоль через пробел
//Проитерировать список через for-each и отпечатать имена в консоль через пробел
//Создать пустую карту, где ключем является целое число, а значением обьект песка
//Заполнить карту значениями из предыдущего списка, используя в качестве ключа любое уникальное число
//Проитерировать карту и отпечатать ключи в консоль
//Проитерировать карту и отпечатать значения в консоль
//Проитерировать карту и отпечатать пары ключ-значение в консоль

import tasks.homework.additionalbubble.Sand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sandbox {

    public static void main(String[] args) {

        List<Sand> sandbox = new ArrayList<>();

        sandbox.add(new Sand(2, "Речной"));
        sandbox.add(new Sand(4, "Речной"));
        sandbox.add(new Sand(2, "Карьерный"));
        sandbox.add(new Sand(7, "Речной"));

        for (Sand sand : sandbox) {
            System.out.print(sand.getWeight() + " ");
        }

        System.out.println();

        for (Sand sand : sandbox) {
            System.out.print(sand.getName() + " ");
        }

        System.out.println();

        Map<Integer, Sand> sandboxMap = new HashMap<>();

        for (int i = 0; i < sandbox.size(); i++) {
            sandboxMap.put(sandboxMap.size(), sandbox.get(i));
        }

        for (int mapKey : sandboxMap.keySet()) {
            System.out.print(mapKey + " ");
        }

        System.out.println();

        for (Sand sand : sandboxMap.values()) {
            System.out.print(sand + " ");
        }

        System.out.println();

        for (Map.Entry<Integer, Sand> map : sandboxMap.entrySet()) {
            System.out.println(map);
        }
    }
}