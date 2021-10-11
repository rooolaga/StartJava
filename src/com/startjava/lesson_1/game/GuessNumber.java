package com.startjava.lesson_1.game;

public class GuessNumber {
    public static void main(String[] args) {
        int computerNumber = (int) (Math.random() * 100 + 1);
        int startRange = 0;
        int endRange = 100;
        int userNumber = Math.abs(startRange - endRange) / 2;

        while (userNumber != computerNumber) {
            System.out.print(userNumber + " ");
            if (userNumber > computerNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
                endRange = userNumber;
                userNumber = Math.abs(startRange + userNumber) / 2;
            } else if (userNumber < computerNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
                startRange = userNumber;
                userNumber = Math.abs(userNumber + endRange) / 2;
            }
        }

        System.out.println(userNumber + " = " + computerNumber);
        System.out.println("Поздравляю, число угадано!");
    }
}
