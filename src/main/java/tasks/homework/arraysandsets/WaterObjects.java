package tasks.homework.arraysandsets;

//Создать список воды (класса Water) water из 3 обьектов воды с цветом (Прозрачная, Прозрачная, Мутная) и запахом (Нет, Нет, Аммиачный) соответственно, через (Arrays.asList())
//Проитерировать список через for-each и отпечатать пары цвет-вода через тире в консоль с новой строки

import tasks.homework.additionalbubble.Water;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WaterObjects {

    public static void main(String[] args) {

        List<Water> water = new ArrayList<>(Arrays.asList(new Water("Прозрачная", "Нет"), new Water("Прозрачная", "Нет"), new Water("Мутная", "Аммиачный")));

        for (Water water1 : water) {
            System.out.println(water1.getColor() + "-" + water1.getSmell());
        }
    }
}