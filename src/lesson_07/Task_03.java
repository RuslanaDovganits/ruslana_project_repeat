package lesson_07;

import java.util.Scanner;

/*
  3. Создайте расписание на 5 дней (что будет в расписании мне не важно).
    Вводится номер дня - программа в ответ выводит все действия на этот день
    Можно использовать и switch и if. Выбирайте самостоятельно
 */
public class Task_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number of a day");
        int number = scanner.nextInt();


        switch (number) {
            case 1 -> System.out.println("Go to work");
            case 2 -> System.out.println("Go to football");
            case 3 -> System.out.println("Today i am going to movie");
            case 4 -> System.out.println("Today I am at home , and my best friend is coming over ");
            case 5 -> System.out.println("Jeee today is friday, and we have a pizza day today");
            case 6 -> System.out.println("Today we are going to shopping");
            case 7 -> System.out.println("Today we are tsilling at home and doing nothing");
        }

    }
}
