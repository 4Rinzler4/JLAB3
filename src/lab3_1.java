import java.util.Arrays;
import java.util.Scanner;

public class lab3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмірність масиву: ");
        int n = scanner.nextInt();

        double[] array = new double[n];

        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextDouble();
        }

        Arrays.sort(array); 

        double sum = 0;
        for (int i = n - 1; i >= Math.max(0, n - 3); i--) {
            sum += array[i];
        }

        System.out.println("Сума трьох найбільших чисел у масиві: " + sum);
    }
}
