package by.training.vnemero.main;

import java.util.Scanner;

public class Task0110 {

    public static void main(String[] args) {
        int n;

        while (true) {
            System.out.print("Enter the n: ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if(n > 1) {
                    if (n % 2 == 0) {
                        break;
                    } else {
                        System.out.print("Odd number! Try again!");
                    }
                } else {
                    System.out.print("Number negative or less than 2! Try again!");
                }
            } else {
                System.out.print("An invalid value! Try again!");
            }
        }

        int[][] matrix = new int[n][n];

        for(int i = 0; i < matrix.length; i++){
            if(i % 2 == 0){
                for(int j = 0; j < matrix[i].length; j++){
                    matrix[i][j] = j+1;
                }
            } else {
                for(int j = 0; j < matrix[i].length; j++){
                    matrix[i][j] = matrix[j].length - j;
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
