package tasks.homework.arraysandsets;

//Создать пустой список стрингов noodles
//Добавить в список 4 вида макарон (Hakka, Ramen, Hibachi, Schezwan)
//Проитерировать список через for-each и отпечатать слова в консоль через тире
//Заменить в каждом слове буквы "а" на букву "о"
//Проитерировать список по индексу и отпечатать слова в консоль через пробел

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Noodles {

    public static void main(String[] args) {

        List<String> noodles = new ArrayList<>();

        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");

        for (String noodle : noodles) {
            if (Objects.equals(noodle, noodles.get(noodles.size() - 1))) {
                System.out.print(noodle);
            } else
                System.out.print(noodle + "-");
        }

        System.out.println();

        for (int i = 0; i < noodles.size(); i++) {
            System.out.print(noodles.get(i).replaceAll("[a]", "o") + " ");
        }
    }
}
