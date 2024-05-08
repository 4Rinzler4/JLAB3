import java.util.Scanner;
import java.util.Random;
public class lab3_2b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n;
        do {
            System.out.print("Введіть розмірність масиву (більше 0): ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println(input + " не є цілим числом. Введіть розмірність масиву (більше 0): ");
            }
            n = scanner.nextInt();
        } while (n <= 0);
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(201) - 100; 
        }
        int sumOfNegatives = 0;
        int productBeforeLastNegative = 1;
        boolean foundLastNegative = false;
        for (int num : array) {
            if (num < 0) {
                sumOfNegatives += Math.abs(num);
                foundLastNegative = true;
            } else if (!foundLastNegative) {
                productBeforeLastNegative *= num;
            }
        }
        System.out.println("Масив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Сума модулів від'ємних елементів: " + sumOfNegatives);
        System.out.println("Добуток елементів до останнього від'ємного: " + productBeforeLastNegative);

        scanner.close();
    }
}
