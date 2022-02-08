package by.training.vnemero.main;

public class Task012 {

    public static void main(String[] args) {
        double a = 2.0;

        double b = 1.0;

        double c = 3.0;

        double x = (b + Math.sqrt((Math.pow(b, 2)) + (4 * a * c))) / (2 * a);
        double y = Math.pow(a, 3) * c;
        double result = x - y + Math.pow(b, -2);
        System.out.println(result);
    }
}
