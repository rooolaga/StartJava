package com.startjava.lesson_1.app;

public class ConditionalStatement {

    public static void main(String[] args) {
        int age = 27;
        if (age > 20) {
            System.out.println("Возраст - больше 20");
        }

        boolean isMale = true;
        if (isMale) {
            System.out.println("Пол - мужской");
        }

        if (!isMale) {
            System.out.println("Пол - женский");
        }

        double height = 1.90;
        if (height < 1.80) {
            System.out.println("Рост - ниже чем 1.80");
        } else {
            System.out.println("Рост - высокий");
        }

        char firstNameLetter = 'E';
        if (firstNameLetter == 'M') {
            System.out.println("Имя начинается на М");
        } else if (firstNameLetter == 'I') {
            System.out.println("Имя начинается на I");
        } else {
            System.out.println("Имя начинается на " + firstNameLetter);
        }
    }
}
