package by.training.vnemero.main;

import java.util.Scanner;

public class Task011 {

    public static void main(String[] args) {
        int number = 9199;

        if (((number / 1000) + ((number / 100) % 10)) == (((number % 100) / 10) + (number % 10))) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
