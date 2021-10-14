package tasks.homework.array;

import java.time.LocalDate;

public class ReturnSumFromArrayDividedThisMonth {

    public int returnSumFromArrayDividedThisMonth() {

        int sum = 0;
        int[] numberArray = new int[100];
        LocalDate localDate = LocalDate.now();

        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] % localDate.getMonthValue() == 0) {
                sum += numberArray[i];
            }
        }

        return sum;

    }
}
