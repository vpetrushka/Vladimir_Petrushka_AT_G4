package tasks.classwork.day10;

import tasks.classwork.day9.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningToMapGroupingBy {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        list.stream().collect(Collectors.joining(":","<p>","</p>"));

        List<Person> people =
                Arrays.asList(
                        new Person("Vasia", 13, Person.Sex.MAN),
                        new Person("Katia", 28, Person.Sex.WOMEN),
                        new Person("Vova", 24, Person.Sex.MAN),
                        new Person("Masha", 38, Person.Sex.WOMEN),
                        new Person("Roman Petrovich", 72, Person.Sex.MAN));

        people.stream().collect(Collectors.toMap(x -> x.hashCode(), x -> x));

        people.stream().collect(Collectors.groupingBy(x -> x.getSex())).keySet().forEach(System.out::println);
    }
}
