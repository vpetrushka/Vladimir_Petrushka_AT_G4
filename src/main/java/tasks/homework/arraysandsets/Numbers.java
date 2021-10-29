package tasks.homework.arraysandsets;

//Создать список целых чисел numbers из 8 чисел (3342, 34, 79, 23426, 68, 1324, 55, 7699) через (Arrays.asList())
//Проитерировать список через for-each и отпечатать числа в консоль новой строки
//Посчитать сумму всех чисел и вывести результат в консоль
//Отсортировать список по возрастанию
//Проитерировать список по индексу и отпечатать числа в консоль через пробел
//Развернуть список в обратном порядке
//Проитерировать список через for-each и отпечатать числа в консоль через пробел

import java.util.*;

public class Numbers {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699));
        int sum = 0;

        for (int number : numbers) {
            System.out.println(number);
            sum += number;
        }

        System.out.println(sum);

        Collections.sort(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }

        System.out.println();
        Collections.reverse(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}