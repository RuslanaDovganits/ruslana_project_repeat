package lesson_07;

import java.util.Scanner;

/*
1. Задача "Времена года".
Человек с консоли вводит время года - выведите на экран, в чем выходить на улицу.
(в чем конкретно выходить - определите сами, главное - работа с swtich)
 */
public class Task_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время года:");
        String timeOfYear = scanner.nextLine().toLowerCase();

        switch (timeOfYear) {
            case "winter" -> System.out.println("Одевайся тепло, на улице - 20");
            case "spring" -> System.out.println("Можно одеть легкую курточку, весна идет!");
            case "summer" -> System.out.println("На улице жара можно, идти в платье");
            case "autumn" -> System.out.println("Обувай резиновые сапоги, и возьми зонтик!");

            default -> System.out.println("Вы ввели не правильно!");
        }
    }
}
