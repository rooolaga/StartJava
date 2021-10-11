package com.startjava.lesson_2.game;

import java.util.Scanner;

public class GuessNumber {

    private Player firstPlayer;
    private Player secondPlayer;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 100 + 1);
        boolean firstPlayerGuess = true;
        int playerNumber;
        do {
            if (firstPlayerGuess) {
                System.out.print("Вводит " + firstPlayer.getName() + " ");
                firstPlayer.setNumber(scanner.nextInt());
                playerNumber = firstPlayer.getNumber();
                firstPlayerGuess = false;
            } else {
                System.out.print("Вводит " + secondPlayer.getName() + " ");
                secondPlayer.setNumber(scanner.nextInt());
                playerNumber = secondPlayer.getNumber();
                firstPlayerGuess = true;
            }

            if (playerNumber > secretNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (playerNumber < secretNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            }

        } while (secretNumber != playerNumber);

        System.out.println(secretNumber + " = " + playerNumber);
        if (firstPlayerGuess) {
            System.out.println("Победил " + secondPlayer.getName() + " игрок");
        } else {
            System.out.println("Победил " + firstPlayer.getName() + " игрок");
        }
    }
}
