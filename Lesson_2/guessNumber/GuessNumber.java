package guessNumber;

import java.util.Scanner;

public class GuessNumber {

    private Player firstPlayer;
    private Player secondPlayer;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void start() {

        Scanner scanner = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 100 + 1);
        boolean firstPlayerGuess = true;
        int userNumber;
        do {
            if (firstPlayerGuess) {
                System.out.print("Вводит " + firstPlayer.getName() + " ");
                firstPlayer.setNumber(scanner.nextInt());
                userNumber = firstPlayer.getNumber();
                firstPlayerGuess = false;
            } else {
                System.out.print("Вводит " + secondPlayer.getName() + " ");
                secondPlayer.setNumber(scanner.nextInt());
                userNumber = secondPlayer.getNumber();
                firstPlayerGuess = true;
            }

            if (userNumber > secretNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (userNumber < secretNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            }

        } while (secretNumber != userNumber);

        System.out.println(secretNumber + " = " + userNumber);
        if (firstPlayerGuess) {
            System.out.println("Победил " + secondPlayer.getName() + " игрок");
        } else {
            System.out.println("Победил " + firstPlayer.getName() + " игрок");
        }
    }
}
