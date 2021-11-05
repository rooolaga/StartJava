package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player firstPlayer;
    private Player secondPlayer;
    private boolean firstPlayerGuess = true;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void start() {
        int secretNumber = (int) (Math.random() * 100 + 1);

        System.out.println("У каждого игрока по 10 попыток");
        for (int i = 0; i < 10; i++) {
            if (runPlayerAttempt(firstPlayer, secretNumber)) break;
            if (runPlayerAttempt(secondPlayer, secretNumber)) break;

            if (i == 9) {
                System.out.println("У " + firstPlayer.getName() + " закончились попытки");
                System.out.println("У " + secondPlayer.getName() + " закончились попытки");
            }
        }

        printAttempts(firstPlayer);
        firstPlayer.clearAttempts();
        printAttempts(secondPlayer);
        secondPlayer.clearAttempts();
    }

    public boolean runPlayerAttempt(Player player, int secretNumber) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Вводит " + player.getName() + " ");
        player.setAttempt(scanner.nextInt());
        if (player.getLastNumber() == secretNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + secretNumber + " с " + player.getAttemptsCounter() + " попытки");
            return true;
        } else if (player.getLastNumber() > secretNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
            return false;
        } else {
            System.out.println("Данное число меньше того, что загадал компьютер");
            return false;
        }
    }

    public void printAttempts(Player player) {
        int[] attempts = Arrays.copyOf(player.getAttempts(), player.getAttemptsCounter());
        System.out.print("Попытки игрока " + player.getName() + " ");
        for (int attempt : attempts) {
            System.out.print(attempt + " ");
        }
        System.out.println();
    }
}
