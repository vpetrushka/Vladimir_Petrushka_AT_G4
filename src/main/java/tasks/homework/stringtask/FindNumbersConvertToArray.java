package tasks.homework.stringtask;

import java.util.Arrays;

//2.2 найти в тексте все цифры и преобразовать их в массив числовых переменных, вывести все элементы массива в косоль
public class FindNumbersConvertToArray {

    public static void main(String[] args) {

        FindNumbersConvertToArray findNumbersConvertToArray = new FindNumbersConvertToArray();

        findNumbersConvertToArray("afj30yf98g8 hf3h093dc ddfois dhfo hsdofhi22");

    }

    public static void findNumbersConvertToArray(String originalInput) {

        String[] arr = originalInput.split("\\D");

        //do counter if not equal " "

        int counter = 0;

        for (String a  : arr){
            if(!arr.equals("")){
                counter++;
            }
        }


        int[] intArray = new int[counter];


        for (String s : arr
                ) {
            if (!s.equals("")) {
                intArray[counter-- - 1] = Integer.parseInt(s);
            }
        }
        System.out.println(Arrays.toString(intArray));
        }
    }
