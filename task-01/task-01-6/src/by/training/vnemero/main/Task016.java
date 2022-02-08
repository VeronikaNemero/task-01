package by.training.vnemero.main;

import java.util.Scanner;

public class Task016 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int c = scanner.nextInt();

        int minNumber;

        if ((a < b) & (a < c)) {
            minNumber = a;
        } else if ((b < a) & (b < c)) {
            minNumber = b;
        } else {
            minNumber = c;
        }

        int maxNumber;

        if ((a > b) & (a > c)) {
            maxNumber = a;
        } else if ((b > a) & (b > c)) {
            maxNumber = b;
        } else {
            maxNumber = c;
        }

        System.out.println("The sum of min and max numbers is " + (maxNumber + minNumber));
    }
}
