package com.startjava.lesson_1.app;

public class Cycle {

    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        int i = -6;
        while (i <= 6) {
            System.out.println(i);
            i += 2;
        }

        int j = 11;
        int sumOdd = 0;
        do {
            sumOdd += j;
            j += 2;
        } while (j <= 19);

        System.out.println(sumOdd);
    }
}
