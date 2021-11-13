package tasks.classwork.day10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Split {

    public static void main(String[] args) {


        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        list.stream().anyMatch(x -> x.matches("мама"));

        list.stream().allMatch(x -> x.contains("м"));

        list.stream().map(x -> x.concat(x + "м")).collect(Collectors.toList());

        list.stream().flatMap(x -> Arrays.stream(x.split("а"))).filter(x -> !x.equals("")).collect(Collectors.toList()).forEach(System.out::println);

    }
}
