import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int num1;
        int num2;
        char operator;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два числа: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        System.out.print("Ввевидите оператор (+, -, *, /, ^, %): ");
        operator = scanner.next().charAt(0);

        System.out.print("Ответ ");
        if (operator == '+') {
            System.out.print(num1 + num2);
        } else if (operator == '-') {
            System.out.print(num1 - num2);
        } else if (operator == '*') {
            System.out.print(num1 * num2);
        } else if (operator == '/') {
            System.out.print(num1 / num2);
        } else if (operator == '^') {
            System.out.print(Math.pow(num1, num2));
        } else if (operator == '%') {
            System.out.print(num1 % num2);
        } else {
            System.out.print("Упс, оператор введен неверно");
        }
    }
}
