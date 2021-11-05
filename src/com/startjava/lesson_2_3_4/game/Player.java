package com.startjava.lesson_2_3_4.game;

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

    public int[] getAttempts() {
        return attempts;
    }

    public void clearAttempts() {
        attemptsCounter = 0;
        Arrays.fill(attempts, 0, attemptsCounter, 0);
    }
}
