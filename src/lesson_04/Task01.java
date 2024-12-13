package lesson_04;

import java.util.Scanner;

public class Task01 {
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

    }
}
