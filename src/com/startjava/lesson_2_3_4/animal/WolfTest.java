package com.startjava.lesson_2_3_4.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf alpha = new Wolf();
        alpha.setAge(7);
        alpha.setColor("серый");
        alpha.setGender("мужской");
        alpha.setName("Бобик");
        alpha.setWeight(45);

        System.out.println("Имя " + alpha.getName());
        System.out.println("Возраст " + alpha.getAge());
        System.out.println("Окрас " + alpha.getColor());
        System.out.println("Пол " + alpha.getGender());
        System.out.println("Вес " + alpha.getWeight());

        alpha.go();
        alpha.howl();
        alpha.hunt();
        alpha.run();
        alpha.seat();
    }
}
