import java.util.Scanner;

public class MaxString {

    public static void launch() {
        String[] operation = createMassive();
        String result = getMaxString(operation);
        System.out.println("Самое длинное слово: " + result);
    }

    public static String[] createMassive(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int arraySize = scanner.nextInt();
        String[] stringArray = new String[arraySize];
        for(int i = 0; i<arraySize; i++){
            System.out.printf("Введите %d-е слово: ", (i + 1));
            String enteredString = scanner.next();
            stringArray[i] = enteredString;
        }
        scanner.close();
        return stringArray;
    }

    public static String getMaxString(String[] names){
        int size = names.length;
        String longestName = names[0];
        for (int i = 0; i < size; i++) {
            if (names[i].length() > longestName.length()) {
                longestName = names[i];
            }
        }
        return longestName;
    }
}
