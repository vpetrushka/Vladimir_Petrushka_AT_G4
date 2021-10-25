package tasks.classwork.day8;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {

    public static void main(String[] args) {

        Map<Integer, String > map = new HashMap<>();

        String[] array = "mama myla ramu myla".split( " ");

        for (int i = 0; i < array.length; i++) {
            map.put(i,array[i]);
        }

        for (Integer x : map.keySet()) {
            System.out.println(x);
        }

        for (String x: map.values()) {
            System.out.println(x);
        }

        for (Map.Entry<Integer,String> x : map.entrySet()){
            System.out.println(x);
        }
    }

}
