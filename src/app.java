// Task 1
public class app {
    public static void main(String[] args) {
        // Task 2
        byte b = 120;
        short sh = -2000;
        int i = 1700;
        long l = 223372036854775807L;
        float f = 16.06f;
        double d = 123.456;
        char c = 's';
        boolean bl = false;
    }

    // Task 3
    public static int expression(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    //Task 4
    public static boolean isSumFrom10To20(double a, double b) {
        double sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        return false;
    }

    // Task 5
    public static void positiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }

    // Task 6
    public static boolean isNegative(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    // Task 7
    public static void printName(String name) {
        System.out.println("Привет, " + name + "!");
    }

    // Task 8
    public static void isYearLeap(int year) {
        boolean isLeap;
        if (year % 400 == 0) {
            isLeap = true;
        } else if (year % 100 == 0) {
            isLeap = false;
        } else if (year % 4 == 0) {
            isLeap = true;
        } else {
            isLeap = false;
        }

        if (isLeap) {
            System.out.println(year + " is leap");
        } else {
            System.out.println(year + " is not leap");
        }
    }
}