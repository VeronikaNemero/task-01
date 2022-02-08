package by.training.vnemero.main;

import java.util.Scanner;

public class Task014 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the x coordinate: ");
        int x = scanner.nextInt();

        System.out.println("Enter the y coordinate: ");
        int y = scanner.nextInt();

        if (((x >= -4) & (x <= 4) & (y >= -3) & (y <= 0)) || ((y >= 0) & (y <=4) & (x >= -2) & (x <= 2))) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
