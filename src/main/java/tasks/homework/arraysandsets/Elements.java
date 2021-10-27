package tasks.homework.arraysandsets;

//Создать пустой список стрингов elements
//Добавить в список 6 элементов (Text field, Radio, Check-box, Drop-down, Picker, Breadcrumb)
//Проитерировать список через for-each и отпечатать слова в консоль через пробел
//Посчитать сколько названий элементов состоит более, чем из одного слова и вывести число в консоль
//Проитерировать список по индексу и отпечатать слова в консоль через пробел
//На 4-ю позицию добавить Spinner
//Удалить 2-й элемент списка
//Заменить 5-й элемент на Switch
//Проитерировать список через for-each и отпечатать слова в консоль через пробел

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Elements {

    public static void main(String[] args) {

        List<String> elements = new ArrayList<>(Arrays.asList("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb"));
        int count = 0;

        for (String element : elements) {
            System.out.print(element + " ");
            if (element.contains(" ") || element.contains("-")) {
                count++;
            }
        }

        System.out.println("\n" + count);

        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i) + " ");
        }

        System.out.println();
        elements.add(4, "Spinner");
        elements.remove(2);
        elements.set(5, "Switch");

        for (String element : elements) {
            System.out.print(element + " ");
        }
    }
}