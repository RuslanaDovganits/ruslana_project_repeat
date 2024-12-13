package lesson_11;
/*
1. Сделать метод, который принимает два целых числа и ВОЗВРАЩАЕТ их разность
*/

public class Main_01 {
    public static void main(String[] args) {
        int answer = minusResult(6, 3);
        System.out.println(answer);
    }

    public static int minusResult(int a, int b) {
        return a - b;
    }

}
