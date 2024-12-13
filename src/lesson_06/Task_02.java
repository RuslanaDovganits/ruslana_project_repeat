package lesson_06;

import java.util.Scanner;

/*
1) В консоль вводится число, если оно больше 1000, то выводите сообщение "Я богат",
     если больше 10000, то "я ультра богат"
2) К первой задаче добавляем: "Если введено больше 100 000, то пишем на экран
     "я могу купить, все что хочу"
3) Доделать конвертер валют. Теперь, после ввода валюты и количества денег, вы должны
    посчитать, сколько денег получит человек в выбранной валюте.
    Используйте условные операторы для выбора нужных переменных и выведите финальный результат на экран
 */
public class Task_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num > 1000 && num <10_000) {
            System.out.println("I am rich");
        }
        if (num > 10_000 && num < 100_000) {
            System.out.println("i am ultra rich");
        }
        if (num > 100_000) {
            System.out.println("I can buy what ever I want!");
        }


    }
}
