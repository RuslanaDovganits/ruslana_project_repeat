package lesson_09;

import java.util.Arrays;
import java.util.Random;

/*
    3. Создать массив, заполнить его любым образом.
    Найти количество элементов в массиве, которые больше, чем их соседи слева.
    Сосед слева - элемент, который располагается ДО текущего элемента
    Пример : [1, 5, 3, 7, 11] - Ответ: 3
 */
public class Task_03 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[15];
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 100);
        }
            for (int i = 1; i < array.length; i++) {
                if (array[i] > (array[i - 1])) {
                    counter++;
                }
            }
        System.out.println(Arrays.toString(array));
        System.out.println(counter);




    }
}
