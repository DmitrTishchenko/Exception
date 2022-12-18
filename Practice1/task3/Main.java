package Practice1.task3;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = { 2, null, null };
        checkArray(arr);
    }

    private static void checkArray(Integer[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                System.out.println("По индексу " + i + " элемент null");
            }
        }
    }
}
