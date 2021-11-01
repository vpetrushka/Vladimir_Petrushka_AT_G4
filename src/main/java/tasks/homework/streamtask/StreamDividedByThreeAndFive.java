package tasks.homework.streamtask;

//- сгенерировать List коллекцию целых чисел из n элементов от minValue до maxValue и определить,
// содержаться ли в данной коллекции числа, которые делятся и на 3 и на 5 с помощь stream

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDividedByThreeAndFive {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input min int value");
        int minValue = sc.nextInt();
        System.out.println("Input max int value");
        int maxValue = sc.nextInt();

        List<Integer> integerList = Stream.iterate(minValue, n -> n + 1).limit(maxValue).collect(Collectors.toList());

        boolean isEmpty = integerList.stream().anyMatch(x -> (x % 3 == 0 && x % 5 == 0));

        System.out.println(isEmpty);
    }
}