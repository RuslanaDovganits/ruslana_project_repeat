package lesson_12;

import java.util.Scanner;

public class Main_01 {
    public static void main(String[] args) {


        System.out.println("Input 3 numbers!");
        userThreeNumbers();
        usersOneMoreNumber();
        System.out.println("Input one more number!");


    }



    public static void userThreeNumbers() {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();
        System.out.println("Произведение трех чисел: " + (numberOne * numberTwo * numberThree));
        System.out.println("Сумма трех чисел: " + (numberOne + numberTwo + numberThree));
    }

    public static void usersOneMoreNumber() {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();
        int fourthNumber = scanner.nextInt();
        if (fourthNumber == 1) {

            System.out.println("Произведение трех чисел: " + (numberOne * numberTwo * numberThree));
        }
        if (fourthNumber == 2) {
            System.out.println("Сумма трех чисел: " + (numberOne + numberTwo + numberThree));
        }

    }


}
