package lesson_08;
/*
 Вывести числа от 0 до 1000, кратные 5
 */
public class Task_02 {
    public static void main(String[] args) {

        for (int i = 0; i < 1001; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
