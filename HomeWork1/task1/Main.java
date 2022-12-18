package HomeWork1.task1;

public class Main {

    // Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        // createNegativeLength(-1);
        // divisionByZero(2);
        callMethod3("12e");

    }

    private static int divisionByZero(int i) {
        return i / 0;
    }

    private static int[] createNegativeLength(int size) {
        return new int[size];
    }

    private static int callMethod3(String s) {

        return Integer.parseInt(s);
    }
}
