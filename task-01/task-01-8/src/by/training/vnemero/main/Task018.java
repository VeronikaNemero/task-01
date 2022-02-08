package by.training.vnemero.main;

import java.util.Scanner;

public class Task018 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of digits in array: ");
        int n = scanner.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = ((int)(Math.random() * 50));
            System.out.println(a[i]);
        }

        int k = 3;

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % k == 0) {
                sum += a[i];
            }
        }

        System.out.println("Sum of elements that are multiples of " + k + " equal " + sum);
    }
}
