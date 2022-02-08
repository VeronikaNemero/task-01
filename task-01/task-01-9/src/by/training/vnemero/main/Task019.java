package by.training.vnemero.main;

public class Task019 {

    public static void main(String[] args) {
        int[] array1 = new int[3];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = ((int)(Math.random() * 50));
            System.out.print(array1[i] + ", ");
            if (i == (array1.length - 1)) {
                System.out.println();
            }
        }

        int[] array2 = new int[2];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = ((int)(Math.random() * 50));
            System.out.print(array2[i] + ", ");
            if (i == (array2.length - 1)) {
                System.out.println();
            }
        }

        int[] resultedArray = new int[array1.length + array2.length];

        int k = 2;

        int length = 0;

        for (int i = 0; i < resultedArray.length; i++) {
            if (i >= k && length < array2.length) {
                resultedArray[i] = array2[i - k];
                length++;
            } else {
                resultedArray[i] = array1[i - length];
            }
            System.out.print(resultedArray[i] + ", ");
            if (i == (resultedArray.length - 1)) {
                System.out.println();
            }
        }
    }
}
