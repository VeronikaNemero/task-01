package by.training.vnemero.main;

public class Task017 {

    public static void main(String[] args) {
        double a = 3;

        double b = 4.6;

        double h = 0.1;

        double y;

        System.out.println(".........................");
        System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
        System.out.println(".........................");
        for(double x = a; x <= b; x = x + h) {
            y = Math.sqrt(Math.sin(x)) - Math.cos(2* x);
            System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
        }
        System.out.println(".........................");
    }
}
