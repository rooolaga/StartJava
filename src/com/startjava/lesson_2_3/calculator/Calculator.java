package com.startjava.lesson_2_3.calculator;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private char operator;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setOperator(char operator) {
        this.operator = operator;
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
