package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private char operator;

    public Calculator(String mathExpression) {
        String[] expressionParts = mathExpression.split(" ");
        firstNumber = Integer.parseInt(expressionParts[0]);
        operator = expressionParts[1].charAt(0);
        secondNumber = Integer.parseInt(expressionParts[2]);
    }

    public int calculate() {
        switch (operator) {
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return firstNumber - secondNumber;
            case '*':
                return firstNumber * secondNumber;
            case '/':
                return firstNumber / secondNumber;
            case '^':
                return (int) Math.pow(firstNumber, secondNumber);
            case '%':
                return firstNumber % secondNumber;
            default:
                return 0;
        }
    }
}
