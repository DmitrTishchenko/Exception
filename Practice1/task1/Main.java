package Practice1.task1;

public class Main {
    static int[] array = { 1, 2, 3, 4, 1231, 321, 12, 33, 11, 22, 123, 111, 333, 11 };

    public static void main(String[] args) {

        int element = 3;
        System.out.println(findElement(array, element));

    }

    private static int findElement(int[] array, int element) {
        int min = 10;

        if (array == null) {
            return -3;
        }

        if (array.length < min) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;

            }
        }

        return -2;
    }
}
