package lesson_06;

import java.util.Scanner;

/*
 Доделать конвертер валют. Теперь, после ввода валюты и количества денег, вы должны
посчитать, сколько денег получит человек в выбранной валюте.
Используйте условные операторы для выбора нужных переменных и
 выведите финальный результат на экран
 */
public class Converter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Приветствуем в CurrencyConverter!");
        System.out.println();
        System.out.println("Выберите исходную валюту:\n" +
                "1. EURO\n" +
                "2. USD\n" +
                "3. TL");

        double gbrToEuro = 1.20;
        double gbrToUsd = 1.34;
        double gbrToUah = 54.83;

        int currencyNumber = scanner.nextInt();
        System.out.println("Введите сумму для перевода:");
        int sum = scanner.nextInt();

        if (currencyNumber == 1) {
            System.out.println("Ваша сумма " + gbrToEuro * sum);
        }
        if (currencyNumber == 2) {
            System.out.println("Ваша сумма " + gbrToUsd * sum);
        }
        if (currencyNumber == 2) {
            System.out.println("Ваша сумма " + gbrToUah * sum);
        }

    }
}
