package tasks.classwork.day10;

import tasks.classwork.day9.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortPeekCompareTo {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        list.stream().sorted((x, y) -> -x.compareTo(y)).distinct().collect(Collectors.toList());

        List<Person> people =
                Arrays.asList(
                        new Person("Vasia", 13, Person.Sex.MAN),
                        new Person("Katia", 28, Person.Sex.WOMEN),
                        new Person("Vova", 24, Person.Sex.MAN),
                        new Person("Masha", 38, Person.Sex.WOMEN),
                        new Person("Roman Petrovich", 72, Person.Sex.MAN));

        people.stream().sorted((x, y) -> {
                    if
                    (x.getSex() != y.getSex()) {
                        return x.getSex().compareTo(y.getSex());
                    }
                        return x.getAge() - y.getAge();
                }
        ).peek(System.out::println).collect(Collectors.toList());

    }
}

