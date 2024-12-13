package lesson_05;

import java.util.Scanner;

/* 1. Сделать сканнер
    2. Сканнер считывет число
    3. Если число двухзначное, то вывести true, иначе false
*/
public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число на проверку двухзначности:");

        int number = scanner.nextInt();
        boolean numIsDouble = (number >= 10 && number <100) || (number <= -10 && number > -100);
        System.out.println("Число двухзначное: " + numIsDouble);


    }
}
