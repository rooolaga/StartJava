package Calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String wantContinue;

        do {
            System.out.print("Введите первое число: ");
            calculator.setFirstNumber(scanner.nextInt());
            System.out.print("Введите знак математической операции: ");
            calculator.setOperator(scanner.next().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setSecondNumber(scanner.nextInt());
            calculator.calculate();

            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            wantContinue = scanner.next();
        } while (wantContinue.equals("yes"));
    }
}
