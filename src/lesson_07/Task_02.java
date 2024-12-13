package lesson_07;

import java.util.Scanner;

/*
    2. Задача "Школьники". Есть три школьника: Афанисий, Петро, Зигмунд.
    Афанасий медленно думает, Петро медленно думает и плохо говорит, Зигмунд медленно думает, плохо говорит
    и ничего не слышит. С консоли вводится имя школьника.
    Выведите на экран все качества человека, имя которого ввели. (switch)
 */
public class Task_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scanner.nextLine();

        switch (name) {
            case "Афанисий" -> System.out.println("медленно думает!");
            case "Петро" -> System.out.println("медленно думает и плохо говорит!");
            case "Зигмунд" -> System.out.println("медленно думает, плохо говорит и ничего не слышит!");



        }


    }
}
