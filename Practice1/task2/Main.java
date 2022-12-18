package Practice1.task2;

public class Main {
    public static void main(String[] args) {
        int[][] array = { { 0, 1, 1, 1 }, { 0, 1, 0, 0 }, { 0, 1, 0, 0 }, { 0, 1, 0, 0 } };
        System.out.println(sumArray(array));
    }

    private static int sumArray(int[][] array) {

        int sum = 0;
        if (!isQuadro(array)) {
            throw new RuntimeException("Массив не квадратный");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != 0 && array[i][j] != 1) {
                    throw new RuntimeException("0 или 1!");
                }
                sum += array[i][j];
            }
        }
        return sum;

    }

    public static boolean isQuadro(int[][] array) {
        int rows = array.length;

        for (int i = 1; i < array.length; i++) {
            if (rows != array[i].length) {
                return false;
            }
        }

        return true;
    }
}
