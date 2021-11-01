package tasks.classwork.day9;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamClass {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        long count = list.stream().filter("мама"::equalsIgnoreCase).count();

        System.out.println(count);

        System.out.println(list.stream().findFirst().orElse("мама"));

        System.out.println(list.stream().filter(x -> x.equalsIgnoreCase("мама")).findFirst().get());

        System.out.println(list.stream().skip(4).findFirst().get());

        System.out.println(Arrays.toString(list.stream().skip(2).limit(2).toArray()));

        System.out.println(list.stream().distinct().filter(x -> x.contains("м")).collect(Collectors.toList()));

    }

}