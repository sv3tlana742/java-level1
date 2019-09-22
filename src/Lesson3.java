import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
//      1.  Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
//      При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше. После
//      победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
       while (game());
    }

    public static boolean game() {
        int number = (new Random()).nextInt(10);
        Scanner sc = new Scanner(System.in);
        int attempts = 3;
        while (attempts-- > 0) {
            System.out.println("Введите число");
            int userNumber = sc.nextInt();

            if (number == userNumber) {
                System.out.println("Вы выграли!!! Повторить игру еще раз? 1 – да / 0 – нет");
                return sc.nextInt() == 1;
            } else if (number < userNumber) {
                System.out.println("Введенное Вами число больше");
            } else {
                System.out.println("Введенное Вами число меньше");
            }
        }

        System.out.println("Вы проиграли!!! Повторить игру еще раз? 1 – да / 0 – нет");
        return sc.nextInt() == 1;
    }
}
