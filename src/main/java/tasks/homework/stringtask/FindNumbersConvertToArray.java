package tasks.homework.stringtask;

import java.util.Arrays;

//2.2 найти в тексте все цифры и преобразовать их в массив числовых переменных, вывести все элементы массива в косоль
public class FindNumbersConvertToArray {

    public static void findNumbersConvertToArray(String originalInput) {

        int arrayLength = 0;
        int[] intArray = new int[10]; // this is wrong TODO

        for (int i = 0; i < originalInput.length(); i++) {
            char ch = originalInput.charAt(i);
            if (Character.isDigit(ch)) {
                intArray[arrayLength] = Integer.parseInt(String.valueOf(originalInput.charAt(i)));
                arrayLength++;
            }
        }
        System.out.println(Arrays.toString(intArray));
    }
}
