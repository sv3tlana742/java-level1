package Lesson7;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(30);
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Шуруп", 15);
        cats[1] = new Cat("Компот", 20);
        cats[2] = new Cat("Зажик", 10);
        cats[3] = new Cat("Бантик", 25);
        cats[4] = new Cat("Коржик", 15);
        for (Cat cat: cats) {
            plate.info();
            cat.eat(plate);
        }
        plate.addFood(20);
    }
}
