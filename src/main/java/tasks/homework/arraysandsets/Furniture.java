package tasks.homework.arraysandsets;

//Создать список стульев (класса Chair) furniture из 3 стульев высотой (1, 4, 2) и шириной (2, 2, 4) соответственно, через (Arrays.asList())
//Проитерировать список через for-each и отпечатать произведение высоты на ширину в консоль через пробел
//Создать пустую карту, где ключем является целое число, а значением обьект стула
//Заполнить карту значениями из предыдущего списка, используя в качестве ключа любое уникальное число
//Проитерировать карту и отпечатать ключи в консоль
//Проитерировать карту и отпечатать значения в консоль
//Проитерировать карту и отпечатать пары ключ-значение в консоль

import tasks.homework.additionalbubble.Chair;

import java.util.*;

public class Furniture {

    public static void main(String[] args) {

        List<Chair> furniture = new ArrayList<>(Arrays.asList(new Chair(1, 2), new Chair(4, 2), new Chair(2, 4)));
        Map<Integer, Chair> furnitureSet = new HashMap<>();

        for (Chair chair : furniture) {
            System.out.print(chair.getHeight() * chair.getWidth() + " ");
        }

        System.out.println();

        for (int i = 0; i < furniture.size(); i++) {
            furnitureSet.put(i, furniture.get(i));
        }

        for (int key : furnitureSet.keySet()) {
            System.out.print(key + " ");
        }

        System.out.println();

        for (Chair chair : furnitureSet.values()) {
            System.out.print(chair + " ");
        }

        System.out.println();

        for (Map.Entry<Integer, Chair> chairMap : furnitureSet.entrySet()) {
            System.out.println(chairMap);
        }
    }
}