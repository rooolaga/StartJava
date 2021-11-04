package com.startjava.lesson_2_3.game;

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
        for(int i=0; i < 10; i++) {
            if (checkPlayerNumber(firstPlayer, secretNumber)) break;
            if (checkPlayerNumber(secondPlayer, secretNumber)) break;

            if (i == 9) {
                System.out.println("У " + firstPlayer.getName() + " закончились попытки");
                System.out.println("У " + secondPlayer.getName() + " закончились попытки");
            }
        }

        firstPlayer.printAttempts();
        firstPlayer.clearAttempts();
        secondPlayer.printAttempts();
        secondPlayer.clearAttempts();
    }

    public boolean checkPlayerNumber(Player player, int secretNumber) {
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
}
