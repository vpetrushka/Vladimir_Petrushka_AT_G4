package tasks.classwork.day8;

import java.util.*;

public class HashAndTreeSet {

    public static void main(String[] args) {


        Set<String> myList1 = new HashSet<>();
        Set<String> myList2 = new TreeSet<>();

        long t0 = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            myList1.add("mama" + Math.random());
        }

        System.out.println(System.currentTimeMillis() - t0);
        t0 = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            myList2.add("mama" + Math.random());
        }

        System.out.println(System.currentTimeMillis() - t0);
        t0 = System.currentTimeMillis();

        for (String x : myList1
        ) {
            myList1.size();
        }
        System.out.println(System.currentTimeMillis() - t0);
        t0 = System.currentTimeMillis();

        for (String x : myList2
        ) {
            myList2.size();
        }


        System.out.println(System.currentTimeMillis() - t0);

    }
}
