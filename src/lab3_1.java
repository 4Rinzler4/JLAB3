import java.util.Scanner;
import java.util.Arrays;

public class lab3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        boolean continueProgram = true;

        while (continueProgram) {
            try {
                System.out.print("Введіть розмірність масиву: ");
                n = scanner.nextInt();
                scanner.nextLine();

                if (n <= 0) {
                    System.out.println("Розмірність масиву має бути додатнім числом.");
                    continue;
                }

                double[] array = new double[n];

                System.out.println("Введіть елементи масиву:");
                for (int i = 0; i < n; i++) {
                    System.out.print("Елемент " + (i + 1) + ": ");
                    if (scanner.hasNextDouble()) {
                        array[i] = scanner.nextDouble();
                    } else {
                        System.out.println("Помилка: Введені дані повинні бути числами.");
                        scanner.nextLine();
                        i--;
                    }
                }

                Arrays.sort(array);

                double sum = 0;
                for (int i = n - 1; i >= Math.max(0, n - 3); i--) {
                    sum += array[i];
                }

                System.out.println("Сума трьох найбільших чисел у масиві: " + sum);

                System.out.print("Бажаєте продовжити роботу (так/ні)? ");
                String choice = scanner.next();
                continueProgram = choice.equalsIgnoreCase("так");
            } catch (Exception e) {
                System.out.println("Помилка: " + e.getMessage());
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}

