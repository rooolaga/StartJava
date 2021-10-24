package com.startjava.lesson_2_3.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger crimsonTyphoon = new Jaeger();
        crimsonTyphoon.setModelName("Crimson Typhoon");
        crimsonTyphoon.setMark("Mark-4");
        crimsonTyphoon.setOrigin("China");
        crimsonTyphoon.setHeight(250);
        crimsonTyphoon.setWeight(1.722f);
        crimsonTyphoon.setSpeed(9);
        crimsonTyphoon.setStrength(8);
        crimsonTyphoon.setArmor(6);
        System.out.print("Model: " + crimsonTyphoon.getModelName() + ", Name: " + crimsonTyphoon.getMark() + ", Action: ");
        crimsonTyphoon.move();

        Jaeger strikerEureka = new Jaeger("Striker Eureka", "Mark-5", "Australia", 250, 1.850f, 10, 10, 9);
        System.out.print("Model: " + strikerEureka.getModelName() + ", Name: " + strikerEureka.getMark() + ", Action: " + strikerEureka.scanKaiju());
    }
}
