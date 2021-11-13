package tasks.classwork.day10;

import org.w3c.dom.ls.LSOutput;
import tasks.classwork.day9.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringAndPersonOperations {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

//        list.stream().flatMap(x -> Arrays.stream(x.split("")))
//                .peek(System.out::println)
//                .max(String::compareTo)
//                .get();
        list.stream().flatMap(x -> Arrays.stream(x.split(""))).count();
        list.stream().mapToInt(String::length).sum();

        List<Person> people =
                Arrays.asList(
                        new Person("Vasia", 13, Person.Sex.MAN),
                        new Person("Katia", 28, Person.Sex.WOMEN),
                        new Person("Vova", 24, Person.Sex.MAN),
                        new Person("Masha", 38, Person.Sex.WOMEN),
                        new Person("Roman Petrovich", 72, Person.Sex.MAN));

        people.stream().min(Comparator.comparingInt(Person::getAge)).get();
    }
}
