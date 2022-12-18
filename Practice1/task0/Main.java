package Practice1.task0;

public class Main {
    public static void main(String[] args) {
        int[] array = { 1, 7, 5, 32, 87, 4, 7, 123, 444, 4213, 123 };
        System.out.println(getArrLenght(array));
    }

    private static int getArrLenght(int[] array) {
        int min = 10;
        if (array.length < min) {
            return -1;
        }
        return array.length;
    }
}
