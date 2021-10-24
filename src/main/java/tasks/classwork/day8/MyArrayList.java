package tasks.classwork.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArrayList {

    public static void main(String[] args) {

        String phrase = "mama myla ramy myla";

        List<String> myList = new ArrayList<>();

        for (String a : phrase.split(" ")  ) {
            myList.add(a);
        }

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        System.out.println();

        for (String a: myList) {
            System.out.println(a);
        }
    }
}
