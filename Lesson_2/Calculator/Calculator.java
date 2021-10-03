package Calculator;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private char operator;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public void calculate() {
        System.out.print("Ответ: ");
        switch (this.operator) {
            case '+':
                System.out.println(this.firstNumber + this.secondNumber);
                break;
            case '-':
                System.out.println(this.firstNumber - this.secondNumber);
                break;
            case '*':
                System.out.println(this.firstNumber * this.secondNumber);
                break;
            case '/':
                System.out.println(this.firstNumber / this.secondNumber);
                break;
            case '^':
                int powResult = 1;
                for (int i = 1; i <= this.secondNumber; i++) {
                    powResult *= this.firstNumber;
                }
                System.out.println(powResult);
                break;
            case '%':
                System.out.println(this.firstNumber % this.secondNumber);
                break;
            default:
                System.out.println("Упс, оператор введен неверно");
        }
    }
}
