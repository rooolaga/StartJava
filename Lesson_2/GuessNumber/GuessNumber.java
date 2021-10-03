package GuessNumber;

import java.util.Scanner;

public class GuessNumber {

    private Player firstPlayer;
    private Player secondPlayer;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void startGame(Scanner scanner) {
        String wantContinue = "yes";

        do {
            int computerNumber = (int) (Math.random() * 100 + 1);
            boolean firstPlayerGuess = true;
            int userNumber;
            do {
                if (firstPlayerGuess) {
                    System.out.print("Вводит " + firstPlayer.getName() + " ");
                    this.firstPlayer.setNumber(scanner.nextInt());
                    userNumber = this.firstPlayer.getNumber();
                    firstPlayerGuess = false;
                } else {
                    System.out.print("Вводит " + secondPlayer.getName() + " ");
                    this.secondPlayer.setNumber(scanner.nextInt());
                    userNumber = this.secondPlayer.getNumber();
                    firstPlayerGuess = true;
                }

                if (userNumber > computerNumber) {
                    System.out.println("Данное число больше того, что загадал компьютер");
                } else if (userNumber < computerNumber) {
                    System.out.println("Данное число меньше того, что загадал компьютер");
                }

            } while (computerNumber != userNumber);

            System.out.println(computerNumber + " = " + userNumber);
            if (firstPlayerGuess) {
                System.out.println("Победил " + secondPlayer.getName() + " игрок");
            } else {
                System.out.println("Победил " + firstPlayer.getName() + " игрок");
            }

            do {
                System.out.print("Хотите продолжить игру? [yes/no]:");
                wantContinue = scanner.next();
            } while (!wantContinue.equals("yes") && !wantContinue.equals("no"));
        } while (!wantContinue.equals("no"));
    }
}
