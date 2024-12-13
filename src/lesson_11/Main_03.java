package lesson_11;

/*
3. Сделать метод, который принимает строку. Этот метод возвращает целое число -
 длину введеной строки. Как это сделать - найдите самостоятельно
 */
public class Main_03 {
    public static void main(String[] args) {

        String string = "Hello, my name is Ruslana.";
        int answer = countOfLetters(string);
        System.out.println(answer);

    }

    public static int countOfLetters(String string) {
        return string.length();
    }
}

