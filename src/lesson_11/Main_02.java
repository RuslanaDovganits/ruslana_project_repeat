package lesson_11;
/*    2. Сделать метод, который принимает массив и индекс (целое число). Возвращает значение элемента массива, лежащего под этим индексом
    Пример: method(array, 2) = хочу получить второй элемент из массива array*/

public class Main_02 {
    public static void main(String[] args) {
        int[] myArray = {34, 56, 2, 5, 856, 3, 45};
        int answer = returnNumber(myArray, 4);
        System.out.println("Ваше число: " + answer);
    }

    public static int returnNumber(int[] array, int index) {
        return array[index];
    }
}




