package tasks.classwork.day10;

import java.util.Arrays;
import java.util.List;

public class SummingInt {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        int a = list.stream().map(String::length).mapToInt(x -> x % 2 == 0 ? 0: x).sum();

        System.out.println(a);
    }
}
