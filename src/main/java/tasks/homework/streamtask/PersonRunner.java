package tasks.homework.streamtask;

//Сгенерировать группу из 100 человек в возрасте от 15 до 30 лет.
// Написать одну непрерывную цепочку stream вызовов, которая выбирает людей, возраст которых меньше 21, выводит их имена и возраст в консоль,
// сортирует по фамилии, а потом по имени(использовать thenComparing у объекта Comparator),
// берет 4 первых человека, формирует коллекцию из имен объектов, собирает все в коллекцию

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonRunner {

    public static void main(String[] args) {

        AtomicInteger i = new AtomicInteger();

        RandomStringArray randomStringArray = new RandomStringArray();

        List<Person> collect = Stream.generate(() -> new Person(randomStringArray.randomString(), randomStringArray.randomString(), i.getAndIncrement())).
                limit(100).
                filter(p -> p.getAge() < 21).
                peek(person -> System.out.println(person.getName() + " " + person.getSurname())).
                sorted(Comparator.comparing(Person::getSurname).thenComparing(Person::getName)).
                limit(4).
                collect(Collectors.toList());

        System.out.println(collect);
    }
}
