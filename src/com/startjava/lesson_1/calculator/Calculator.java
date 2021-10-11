package com.startjava.lesson_1.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите мат выражение: ");
        int num1 = scanner.nextInt();
        char operator = scanner.next().charAt(0);
        int num2 = scanner.nextInt();

        System.out.print("Ответ: ");
        if (operator == '+') {
            System.out.print(num1 + num2);
        } else if (operator == '-') {
            System.out.print(num1 - num2);
        } else if (operator == '*') {
            System.out.print(num1 * num2);
        } else if (operator == '/') {
            System.out.print(num1 / num2);
        } else if (operator == '^') {
            int powResult = 1;
            for (int i = 1; i <= num2; i++) {
                powResult *= num1;
            }
            System.out.print(powResult);
        } else if (operator == '%') {
            System.out.print(num1 % num2);
        } else {
            System.out.print("Упс, оператор введен неверно");
        }
    }
}
