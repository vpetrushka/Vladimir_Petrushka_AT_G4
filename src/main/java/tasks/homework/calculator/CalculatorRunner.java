package tasks.homework.calculator;

import java.util.Scanner;

import static tasks.homework.calculator.CalculatorMethods.*;

public class CalculatorRunner {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("input method add, minus, multiply or divide");
        String method = in.nextLine();
        System.out.println("input first number");
        int number1 = in.nextInt();
        System.out.println("Input second number");
        int number2 = in.nextInt();

        switch (method) {
            case "add" -> add(number1, number2);
            case "minus" -> minus(number1, number2);
            case "multiply" -> multilpy(number1, number2);
            case "divide" -> divide(number1, number2);
            default -> System.out.println("Input valid method");
        }
    }
}