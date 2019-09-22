import java.util.Random;
import java.util.Scanner;

//2.Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot","cherry",
//"garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple",
// "pumpkin", "potato"};
// При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным словом и сообщает
// правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
// apple – загаданное
// apricot - ответ игрока
//ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//Для сравнения двух слов посимвольно, можно пользоваться:
//String str = "apple";
//str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
//Играем до тех пор, пока игрок не отгадает слово
//Используем только маленькие буквы
public class Lesson32 {
    public static void main(String[] args) {
        String hid = hiddenWord();
        String typedWord = "";
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите слово");
            typedWord = sc.nextLine();
        } while (!comparison(hid, typedWord));

        System.out.println("Вы выиграли!!!");
    }

    public static String hiddenWord() {
        String[] word = new String[]{"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
        "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
        "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
         Random rand = new Random();
         return word[rand.nextInt(word.length)];
    }

    public static boolean comparison(String hiddenWord, String typedWord) {
        if (hiddenWord.equals(typedWord)) {
            return true;
        }

        char[] hint = "###############".toCharArray();
        for (int i = 0; i < Math.min(hiddenWord.length(), typedWord.length()); i++) {
            if (hiddenWord.charAt(i) == typedWord.charAt(i)) {
                hint[i] = hiddenWord.charAt(i);
            }
        }

        System.out.println(new String(hint));
        return false;
    }
}
