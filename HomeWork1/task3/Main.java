package HomeWork1.task3;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        int size = 10;
        int upperBound = 10;
        int[] array1 = new int[size];
        Random random = new Random();
        IntStream.range(0, size)
                .forEach(index -> array1[index] = random.nextInt(upperBound));
        System.out.println("Список1: " + Arrays.toString(array1));

        int size2 = 10;
        int upperBound2 = 10;
        int[] array2 = new int[size2];
        Random random2 = new Random();
        IntStream.range(0, size2)
                .forEach(index -> array2[index] = random2.nextInt(upperBound2));
        System.out.println("Список2: " + Arrays.toString(array2));

        System.out.println("Частное: " + Arrays.toString(arraysFull(array1, array2)));
    }

    private static double[] arraysFull(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("length array not equal");
        }
        double[] result = new double[array1.length];
        for (int i = 0; i < result.length; i++) {
            if (array2[i] == 0) {
                throw new RuntimeException("На ноль делить нельзя! индекс: " + i);
            }
            result[i] = array1[i] / array2[i];

        }
        return result;
    }
}
