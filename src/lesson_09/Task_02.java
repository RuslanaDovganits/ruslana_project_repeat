package lesson_09;

import java.util.Arrays;
import java.util.Random;

/*
    2. Создать массив размером в 100 элементов, заполнить его случайными значениями (random).
    Найти максимум и минимум массива и вывести их на экран.
 */
public class Task_02 {
    public static void main(String[] args) {

        Random random = new Random();
        int [] array = new int [100];
        for (int i = 0; i < array.length ; i++) {
            array[i] = random.nextInt(0, 100);
            System.out.println(array[i]);

        }
        System.out.println(Arrays.stream(array).max());
        System.out.println(Arrays.stream(array).min());

    }
}
