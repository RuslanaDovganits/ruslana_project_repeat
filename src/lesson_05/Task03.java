package lesson_05;

import java.util.Scanner;

/*  1. Сделать сканнер
    2. Сканнер считывет число
    3. Если число кончается на 7, то вывести true, иначе false */
public class Task03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = scanner.nextInt();

        boolean numberEndsWithSeven = (number % 10 ==  7);
        System.out.println("Число кончается на 7: " + numberEndsWithSeven);



    }
}
