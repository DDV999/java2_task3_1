import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число(1 - Запуск калькулятора, 2 - запуск созданиия массива и поиска в нем слова максимальной длинны):");
        int number;
        number = scanner.nextInt();
        if (number == 1){
            Calculator calculator = new Calculator();
            calculator.launch();
        } else {
            MaxString maxString = new MaxString();
            maxString.launch();
        }
    }
}
