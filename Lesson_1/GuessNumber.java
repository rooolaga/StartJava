public class GuessNumber {
    public static void main(String[] args) {
        int computerNumber = (int) Math.floor(Math.random() * 100);
        int a = 0;
        int b = 100;
        int userNumber = Math.abs(a - b) / 2;
        boolean isWin = false;

        do {
            System.out.print(userNumber + " ");
            if (userNumber == computerNumber) {
                System.out.println(" = " + computerNumber);
                System.out.println("Поздравляю, число угадано!");
                isWin = true;
            } else if (userNumber > computerNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
                b = userNumber;
                userNumber = Math.abs(a + b) / 2;
            } else {
                System.out.println("Данное число меньше того, что загадал компьютер");
                a = userNumber;
                userNumber = Math.abs(a + b) / 2;
            }
        } while (!isWin);

    }
}
