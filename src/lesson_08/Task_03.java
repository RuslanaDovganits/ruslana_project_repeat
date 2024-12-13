package lesson_08;

/*
 Вывести на экран все степени двойки в диапазоне от 1 до 100 000
    Пример: 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048 и так до 100 000
 */
public class Task_03 {
    public static void main(String[] args) {
        int counter = 1;
        while (counter < 100_000) {
            System.out.println(counter);
            counter = counter * 2;


            //Все то же самое, что и в 3 задаче,
            // но вывести необходимо только те числа, которые заканчиваются на 8

            for (int i = 0; i < 100_000; i++) {
                if (i % 10 == 8) {
                    System.out.println(i);
                }
            }
        }
    }
}

