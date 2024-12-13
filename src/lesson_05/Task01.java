package lesson_05;
/*  1. Сделать сканнер
    2. Сканнер считывает число - доход пользователя
    3. если доход пользователя от 500 евро до 2500 евро, то вывести true
    4. если доход пользователя ниже или выше этого значение, то false
*/

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your salary:");
        int salary = scanner.nextInt();
        boolean isSalary = (salary > 500 && salary < 2500);
        System.out.println("isSalary: " + isSalary);


    }
}
