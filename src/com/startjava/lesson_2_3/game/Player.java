package com.startjava.lesson_2_3.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] attempts = new int[10];
    private int attemptsCounter = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAttempt(int playerNumber) {
        attempts[attemptsCounter] = playerNumber;
        attemptsCounter++;
    }

    public int getAttemptsCounter() {
        return attemptsCounter;
    }

    public int getLastNumber() {
        return attempts[attemptsCounter - 1];
    }

    public void printAttempts() {
        int[] attempts = Arrays.copyOf(this.attempts, getAttemptsCounter());
        System.out.print("Попытки игрока " + name + " ");
        for (int i = 0; i < attempts.length; i++) {
            System.out.print(attempts[i] + " ");
        }
        System.out.println();
    }

    public void clearAttempts() {
        attemptsCounter = 0;
        Arrays.fill(attempts, 0, getAttemptsCounter(), 0);
    }
}
