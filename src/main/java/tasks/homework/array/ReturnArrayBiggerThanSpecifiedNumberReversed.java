package tasks.homework.array;

import org.w3c.dom.ls.LSOutput;

//-- написать метод, который вернет целочисленный массив, состоящий только из тех элементов исходного целочисленного массива, которые больше,
// чем число n, где n - целое число, передаваемое в сигнатуру этого метода, элементы в результирующем массиве должны быть расположены в обратном порядке
public class ReturnArrayBiggerThanSpecifiedNumberReversed {

    public int[] returnArrayBiggerThanSpecifiedNumberReversed(int specifiedNumber) {

        int[] numberArray = new int[100];
        int reversedArrayLength = 0;

        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] > specifiedNumber) {
                reversedArrayLength++;
            }
        }

        int[] reversedArray = new int[reversedArrayLength];


        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] > specifiedNumber) {
                reversedArray[reversedArrayLength - 1] = numberArray[i];
                reversedArrayLength--;
                if (reversedArrayLength == 0) {
                    break;
                }
            }

        }
        return reversedArray;
    }
}
