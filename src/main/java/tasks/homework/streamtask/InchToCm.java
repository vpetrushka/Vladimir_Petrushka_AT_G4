package tasks.homework.streamtask;

//- для всех четных значений длин от 1 до 20 дюймов вывести в консоль значения в дюймах, певерести значения в сантиметры и найти сумму

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InchToCm {

    public static void main(String[] args) {

        List<Integer> inches = Stream.iterate(2, n -> n + 2).limit(10).collect(Collectors.toList());
        inches.forEach(System.out::println);
        double sumInCm = inches.stream().mapToDouble(x -> x * 2.54).sum();

    }
}