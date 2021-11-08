package com.startjava.lesson_2_3_4.game;

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
            if (makeMove(firstPlayer, secretNumber)) break;
            if (makeMove(secondPlayer, secretNumber)) break;

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

    private boolean makeMove(Player player, int secretNumber) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Вводит " + player.getName() + " ");
        player.setAttempt(scanner.nextInt());
        if (player.getLastNumber() == secretNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + secretNumber + " с " + player.getAttemptCounter() + " попытки");
            return true;
        } else {
            System.out.println("Данное число " + (player.getLastNumber() > secretNumber ? "больше" : "меньше") + " того, что загадал компьютер");
            return false;
        }
    }

    private void printAttempts(Player player) {
        System.out.print("Попытки игрока " + player.getName() + " ");
        for (int attempt : player.getAttempts()) {
            System.out.print(attempt + " ");
        }
        System.out.println();
    }
}
