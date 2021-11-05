package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wantContinue;

        do {
            System.out.print("Введите математическое выражение: ");
            Calculator calculator = new Calculator(scanner.nextLine());
            System.out.println("Ответ: " + calculator.calculate());

            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                wantContinue = scanner.nextLine();
            } while (!wantContinue.equals("yes") && !wantContinue.equals("no"));
        } while (wantContinue.equals("yes"));
    }
}
