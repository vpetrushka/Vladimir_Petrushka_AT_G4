package tasks.homework.arraysandsets;

//Создать пустой список стрингов cities
//Добавить в список 3 города (Минск, Москва, Берлин)
//Проитерировать список через for-each и отпечатать слова в консоль с новой строки
//Посчитать сумму всех буков во всех словах и вывести число в консоль
//Проитерировать список по индексу и отпечатать слова в консоль через пробел

import java.util.ArrayList;
import java.util.List;

public class Cities {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        int charSum = 0;

        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        for (String city : cities) {
            System.out.println(city);
            charSum += city.length();
        }

        System.out.println(charSum);

        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }
    }
}
