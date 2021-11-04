package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String wantContinue;

        do {
            System.out.print("Введите математическое выражение: ");
            String [] inputArr = scanner.nextLine().split(" ");
            calculator.setFirstNumber(Integer.parseInt(inputArr[0]));
            calculator.setOperator(inputArr[1].charAt(0));
            calculator.setSecondNumber(Integer.parseInt(inputArr[2]));
            System.out.println("Ответ: " + calculator.calculate());

            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                wantContinue = scanner.nextLine();
            } while (!wantContinue.equals("yes") && !wantContinue.equals("no"));
        } while (wantContinue.equals("yes"));
    }
}
