package tasks.homework.arraysandsets;

//Создать список дробных чисел doubles из 8 чисел (33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9) через (Arrays.asList())
//Проитерировать список через for-each и отпечатать числа в консоль черезе пробел
//Посчитать произведение всех чисел и вывести результат в консоль
//найти сумму всех дробных частей и вывести результат в консоль
//Проитерировать список по индексу и челые части в консоль через пробел

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Doubles {

    public static void main(String[] args) {

        List<Double> doubles = new ArrayList<>(Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9));
        double sumOfDoubles = 0;
        double multiplicationsOfFractional = 0;

        for (double number : doubles) {
            System.out.print(number + " ");
            sumOfDoubles += number;

            while (number > 1) {
                number--;
            }
            if (multiplicationsOfFractional == 0) {
                multiplicationsOfFractional = number;
            } else {
                multiplicationsOfFractional *= number;
            }
        }

        System.out.println("\n" + sumOfDoubles);

        System.out.println(multiplicationsOfFractional);

        for (int i = 0; i < doubles.size(); i++) {
            System.out.print(doubles.get(i).intValue() + " ");
        }
    }
}
