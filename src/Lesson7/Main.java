package Lesson7;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Шуруп", 15);
        Cat cat2 = new Cat("Компот", 20);
        Plate plate = new Plate(30);
        plate.info();
        cat.eat(plate);
        plate.info();
        cat2.eat(plate);
        plate.info();
    }
}
