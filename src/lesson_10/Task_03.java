package lesson_10;

//3. Сделать метод, который принимает массив из целых чисел!!!! и в нем находит максимум.
//3.1. Сделать метод, который принимает массив из целых чисел!!!! и в нем находит среднее значение.
public class Task_03 {
    public static void main(String[] args) {

        int[] hello = {3, 6, 87, 9, 234, 29};

        giveMeMaxNumber(hello);
        averageFromArray(hello);
    }

    public static void giveMeMaxNumber(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
        }
        System.out.println("max number is: " + max);
    }


    public static double averageFromArray(int[] array) {
        double sumOfNum = 0;
        double averageFromSum = 0;
        for (int i = 0; i < array.length; i++) {

            sumOfNum += array[i];
            averageFromSum = sumOfNum / array.length;

        }
        System.out.println("average from my array is:  " + averageFromSum);
        return averageFromSum;

    }




}
