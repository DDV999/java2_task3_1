import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void launch() {
        int firstNumber = getNumber();
        int secondNumber = getNumber();
        char operation = getOperation();
        int result = calc(firstNumber, secondNumber, operation);
        System.out.println("Результат операции: " + result);
        scanner.close();
    }

    public static int getNumber() {
        System.out.println("Введите число:");
        int number;
        number = scanner.nextInt();
        return number;
    }

    public static char getOperation() {
        System.out.println("Введите операцию:");
        char operation;
        operation = scanner.next().charAt(0);
        return operation;
    }

    public static int calc(int firstNumber, int secondNumber, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
            default:
                System.out.println("Неизвестная операция. Повторите ввод!");
                result = calc(firstNumber, secondNumber, getOperation());
        }
        return result;
    }
}