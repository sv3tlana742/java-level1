import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {
        // 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int task1[] = {1, 1, 0, 1, 0, 0, 0, 1};
        for (int i = 0; i < task1.length; i++) {
            if (task1[i] == 1) {
                task1[i] = 0;
            } else if (task1[i] == 0) {
                task1[i] = 1;
            }
        }
        System.out.println("Task 1: " + Arrays.toString(task1));

        // 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int [] emptyArr = new  int [8];
        for (int i = 0; i < emptyArr.length; i++) {
            emptyArr[i] = i * 3;
        }
        System.out.println("Task 2: " + Arrays.toString(emptyArr));

        // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int task3[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < task3.length; i++) {
            if (task3[i] < 6) {
                task3[i] = task3[i] * 2;
            }
        }
        System.out.println("Task 3: " + Arrays.toString(task3));

        // 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
        // заполнить его диагональные элементы единицами;
        int[][] task4 = new int[5][5];
        for (int i = 0; i < task4.length; i++) {
            for (int j = 0; j < task4[i].length; j++) {
                if (i == j || i + j == task4.length - 1) {
                    task4[i][j] = 1;
                }
            }
        }
        System.out.println("Task 4:");
        for (int i = 0; i < task4.length; i++) {
            for (int j = 0; j < task4[i].length; j++) {
                System.out.print(task4[i][j] + " ");
            }
            System.out.println();
        }

        // 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        int task5[] = {-1, -5, 2, 8, 4};
        int max = task5[0];
        int min = task5[0];
        for (int i = 0; i < task5.length; i++) {
            if (task5[i] > max) {
                max = task5[i];
            }
            if (task5[i] < min) {
                min = task5[i];
            }
        }
        System.out.println("Task 5:");
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        // 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
        // если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance
        // ([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||,
        // эти символы в массив не входят.
        System.out.println("Task 6:");
        System.out.println(checkBalance(new int[]{1, 1, 1, 2, 1}));
    }

    public static boolean checkBalance(int task6[]) {
        for (int i = 0; i < task6.length - 1; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j <= i; j++) {
                sum1 = sum1 + task6[j];
            }
            for (int j = i + 1; j < task6.length; j++) {
                sum2 = sum2 + task6[j];
            }
            if (sum1 == sum2) {
                return true;
            }
        }
        return false;
    }
}
