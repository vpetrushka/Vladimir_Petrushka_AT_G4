package tasks.classwork.day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EmptySet {

    public static void main(String[] args) {

        Set<String> mySet = new HashSet<>();

        String phrase = "mama myla ramy myla";

        for (String a : phrase.split(" ")  ) {
            mySet.add(a);
        }

        Iterator<String> iterator = mySet.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();

        for (String a : mySet) {
            System.out.println(a);
        }

    }
}
