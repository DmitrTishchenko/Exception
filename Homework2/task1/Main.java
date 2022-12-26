package Homework2.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Реализуйте метод, который запрашивает у пользователя ввод дробного числа
        // (типа float), и возвращает введенное значение.
        // Ввод текста вместо числа не должно приводить к падению приложения,
        // вместо этого, необходимо повторно запросить у пользователя ввод данных.
        System.out.println(getFloat());
    }

    public static double getFloat() {
        double input = 0f;

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите дробное число: ");

            if (sc.hasNextDouble()) {

                input = sc.nextDouble();
                break;
            } else {
                System.out.println("Введено не дробное число! " + sc.next());
            }

        }

        return input;

    }
}
