package Task_with_number;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int number1;
        int number2 = 1;
        if (number % 2 == 0) {
            System.out.println("Четное");
        }
        if (number % 2 == 1) {
            System.out.println("Нечетное");
        }
        if (number % 10 == 0) {
            number1 = number % 10;
            System.out.println(number1);
        }
        if (number % 3 == 0) {
            for (int i = 1; i <= number; i++) {
                number2 = number2 * i;
            }
            System.out.println(number2);
        }
    }
}

