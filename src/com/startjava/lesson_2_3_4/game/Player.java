package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] attempts = new int[10];
    private int attemptCounter;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAttempt(int playerNumber) {
        attempts[attemptCounter] = playerNumber;
        attemptCounter++;
    }

    public int getAttemptCounter() {
        return attemptCounter;
    }

    public int getLastNumber() {
        return attempts[attemptCounter - 1];
    }

    public int[] getAttempts() {
        return Arrays.copyOf(attempts, attemptCounter);
    }

    public void clearAttempts() {
        Arrays.fill(attempts, 0, attemptCounter, 0);
        attemptCounter = 0;
    }
}
