package HomeWork1.task2;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        // Реализуйте метод, принимающий в качестве аргументов два целочисленных
        // массива,
        // и возвращающий новый массив, каждый элемент которого
        // равен разности элементов двух входящих массивов в той же ячейке.
        // Если длины массивов не равны, необходимо как-то оповестить пользователя.

        System.out.print("\033[H\033[2J");
        int size = 10;
        int upperBound = 100;
        int[] array1 = new int[size];
        Random random = new Random();
        IntStream.range(0, size)
                .forEach(index -> array1[index] = random.nextInt(upperBound));
        System.out.println("Список1: " + Arrays.toString(array1));

        int size2 = 10;
        int upperBound2 = 100;
        int[] array2 = new int[size2];
        Random random2 = new Random();
        IntStream.range(0, size2)
                .forEach(index -> array2[index] = random2.nextInt(upperBound2));
        System.out.println("Список2: " + Arrays.toString(array2));

        System.out.println("Разность: " + Arrays.toString(arraysFull(array1, array2)));
    }

    private static int[] arraysFull(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("length array not equal");
        }
        int[] result = new int[array1.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = array1[i] - array2[i];
        }
        return result;
    }
}
