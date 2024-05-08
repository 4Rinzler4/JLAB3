import java.util.Scanner;
public class lab3_2a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (n <= 0) {
            System.out.print("Введіть розмірність масиву (ціле число більше за 0): ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n <= 0) {
                    System.out.println("Розмірність масиву повинна бути більше за 0.");
                }
            } else {
                System.out.println("Будь ласка, введіть ціле число.");
                scanner.next();
            }
        }
        int[] array = new int[n];
        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Елемент " + (i + 1) + ": ");
                if (scanner.hasNextInt()) {
                    array[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Будь ласка, введіть ціле число.");
                    scanner.next();
                }
            }
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
        System.out.println("Сума модулів від'ємних елементів: " + sumOfNegatives);
        System.out.println("Добуток елементів до останнього від'ємного: " + productBeforeLastNegative);
    }
}