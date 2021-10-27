package tasks.homework.arraysandsets;

//Создать список строк стрингов figures из 5 фигур (Овал, Прямоугольник, Круг, Квадрат, Эллипс) через (Arrays.asList())
//Проитерировать список через for-each и отпечатать слова в в файл figures через тире
//Посчитать сколько фигур НЕ содержат букву "и" и вывести число в консоль
//Проитерировать список по индексу и отпечатать слова в консоль через пробел
//Вставить на 3 позицию Треугольник
//Проитерировать список через for-each и отпечатать слова в консоль через пробел

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Figures {

    public static void main(String[] args) throws IOException {

        List<String> figures = new ArrayList<>(Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс"));
        BufferedWriter out = new BufferedWriter((new FileWriter("figures")));
        int counter = 0;

        for (String st : figures) {
            if (st.matches(figures.get(figures.size() - 1)))
                out.write(st);
            else {
                out.write(st + "-");
            }
            if (!st.contains("и")) {
                counter++;
            }
        }
        out.close();

        System.out.println(counter);

        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " ");
        }

        System.out.println();
        figures.set(3, "Треугольник");

        for (String st : figures) {
            System.out.print(st + " ");
        }
    }
}