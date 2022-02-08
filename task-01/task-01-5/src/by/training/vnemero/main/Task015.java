package by.training.vnemero.main;

import java.util.Scanner;

public class Task015 {

    public static void main(String[] args) {
        double a = -4.2;

        double b = 5;

        double c = -1.32;

        if ((a > 0)) {
            a = Math.pow(a, 2);
            System.out.println("a = " + a);
        } else {
            a = Math.pow(a, 4);
            System.out.println("a = " + a);
        }

        if ((b > 0)) {
            b = Math.pow(b, 2);
            System.out.println("b = " + b);
        } else {
            b = Math.pow(b, 4);
            System.out.println("b = " + b);
        }

        if ((c > 0)) {
            c = Math.pow(c, 2);
            System.out.println("c = " + c);
        } else {
            c = Math.pow(c, 4);
            System.out.println("c = " + c);
        }
    }
}
