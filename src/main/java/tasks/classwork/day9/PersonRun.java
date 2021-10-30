package tasks.classwork.day9;

import java.util.Arrays;
import java.util.List;

public class PersonRun {

    public static void main(String[] args) {

        List<Person> people =
        Arrays.asList(
                new Person("Vasia", 13 , Person.Sex.MAN),
                new Person("Katia", 28 , Person.Sex.WOMEN),
                new Person("Vova", 24 , Person.Sex.MAN),
                new Person("Masha", 38 , Person.Sex.WOMEN),
                new Person("Roman Petrovich", 72 , Person.Sex.MAN));
        int count = 0;

        for ( Person person : people){
            if (person.getAge() > 18 && ((person.getAge() < 55 && person.getSex().equals(Person.Sex.WOMEN)) || (person.getAge() < 60 && person.getSex().equals(Person.Sex.MAN))) ){
                count++;
            }
        }

        System.out.println(count);

        long y = people.stream().filter( p -> p.getAge() > 18)
                .filter( p -> (p.getAge() < 55 && p.getSex().equals(Person.Sex.WOMEN)) || p.getAge() < 60 && p.getSex().equals(Person.Sex.MAN))
                .count();

        System.out.println(y);
    }
}