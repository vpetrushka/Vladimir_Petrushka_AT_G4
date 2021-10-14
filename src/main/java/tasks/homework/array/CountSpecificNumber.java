package tasks.homework.array;

public class CountSpecificNumber {
    public void countArrayDigit(int digit) {

        int[] digitArray = new int[200];

        int sum = 0;

        for (int i = 0; i < digitArray.length; i++) {
            sum += digitArray[digit];
            digit = digit + digit;
            if (digit > digitArray.length) {
                break;
            }
        }
    }
}