package lesson_10;
//2. сделать метод, который принимает один параметр - целое число, и пишет на экран
//"Делится на 2", если оно делится на 2. И пишет на экран "не делится на 2", если
//оно не делится на 2

public class Task_02 {
    public static void main(String[] args) {
dividerByTwo(8);
dividerByTwo(7);

    }

    public static void dividerByTwo(int a) {
        if(a % 2 == 0) {
            System.out.println(a  + " Делится на 2");
        } else {
            System.out.println(a  +  " Не делится на 2");
        }

    }
}
