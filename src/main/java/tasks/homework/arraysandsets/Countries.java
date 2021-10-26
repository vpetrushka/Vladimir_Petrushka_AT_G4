package tasks.homework.arraysandsets;

//Создать пустой список стрингов countries
//Добавить в список 4 страны (Андора, Португалия, Англия, Замбия)
//Проитерировать список через for-each и отпечатать слова в консоль через запятую с пробелом
//Посчитать сколько стран, в названии которых меньше 7 букв и вывести число в консоль
//Проитерировать список по индексу и отпечатать слова в консоль с новой строки

import java.util.ArrayList;
import java.util.List;

public class Countries {

    public static void main(String[] args) {

        List<String> countries = new ArrayList<>();
        int count = 0;

        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");

        for ( String country : countries){
            if (!country.matches(countries.get(countries.size()-1))){
                System.out.print(country + ", ");
            } else {
                System.out.print(country);
            }
            if (country.length() < 7){
                count++;
            }
        }

        System.out.println("\n" + count);

        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }
    }
}
