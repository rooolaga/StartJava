package com.startjava.lesson_2.game;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока ");
        Player firstPlayer = new Player(scanner.next());
        System.out.print("Введите имя второго игрока ");
        Player secondPlayer = new Player(scanner.next());
        GuessNumber guessNumber = new GuessNumber(firstPlayer, secondPlayer);
        String wantContinue = "yes";
        do {
            guessNumber.start();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]:");
                wantContinue = scanner.next();
            } while (!wantContinue.equals("yes") && !wantContinue.equals("no"));
        } while (!wantContinue.equals("no"));
    }
}
