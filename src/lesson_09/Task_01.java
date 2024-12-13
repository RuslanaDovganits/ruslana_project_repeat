package lesson_09;
/*
Создать массив, заполнить его любым образом. Вывести элементы с нечетным ИНДЕКСОМ
 */
public class Task_01 {
    public static void main(String[] args) {

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                
            }
        }
    }
}
