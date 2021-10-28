package tasks.homework.arraysandsets;

//Создать пустой список людей (класса Person) people
//Заполнить 4 людьми с возрастом (32, 24, 55, 63) и именами (Коля, Оля, Вася, Маша) соответственно
//Проитерировать список через for-each и отпечатать возраст в консоль через пробел
//Проитерировать список через for-each и отпечатать имена в консоль через пробел
//Проитерировать список по индексу и отпечатать людей (.toString()) в консоль с новой строки

import tasks.homework.additionalbubble.Person;

import java.util.ArrayList;
import java.util.List;

public class People {

    public static void main(String[] args) {

        List<Person> person = new ArrayList<>();

        person.add(new Person(32, "Коля"));
        person.add(new Person(24, "Оля"));
        person.add(new Person(55, "Вася"));
        person.add(new Person(63, "Маша"));

        for (Person person1 : person) {
            System.out.print(person1.getAge() + " ");
        }

        System.out.println();

        for (Person person1 : person) {
            System.out.println(person1.getName() + " ");
        }

        for (int i = 0; i < person.size(); i++) {
            System.out.println(person.get(i).toString());
        }
    }
}
