import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    static final int SIZE = 3;
    static final int DOT_TO_WIN = 3;
    static final char DOT_EMPTY = '*';
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';

    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static char[][] map;

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Вы выиграли!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static boolean checkWin(char symb) {
//        if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
//        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
//        if(map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
//        if(map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
//        if(map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
//        if(map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
//        if(map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
//        if(map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
//        return false;
        for (int x = 0; x <= SIZE - DOT_TO_WIN; x++) {
            for (int y = 0; y <= SIZE - DOT_TO_WIN; y++) {
                if (checkSquare(x, y, symb)) return true;
            }
        }
        return false;
    }

    public static boolean checkSquare(int x, int y, char symb) {
        boolean win1 = true;
        boolean win2 = true;
        for (int i = 0; i < DOT_TO_WIN; i++) {
            if (map[x + i][y + i] != symb) win1 = false;
            if (map[x + i][y + DOT_TO_WIN - 1 - i] != symb) win2 = false;
        }
        if (win1 || win2) return true;

        for (int i = 0; i < DOT_TO_WIN; i++) {
            win1 = true;
            win2 = true;
            for (int j = 0; j < DOT_TO_WIN; j++) {
                if (map[x + i][y + j] != symb) win1 = false;
                if (map[x + j][y + i] != symb) win2 = false;
            }
            if (win1 || win2) return true;
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void aiTurn() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid(i, j)) {
                    map[j][i] = DOT_X;
                    if (checkWin(DOT_X)) {
                        System.out.println("компьютер ввел координаты " + (i + 1) + " " + (j + 1));
                        map[j][i] = DOT_O;
                        return;
                    }
                    map[j][i] = DOT_EMPTY;
                }
            }
        }

        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("компьютер ввел координаты " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        return map[y][x] == DOT_EMPTY;
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
