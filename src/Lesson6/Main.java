package Lesson6;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Коржик");
        Cat cat2 = new Cat("Маркиз");
        debug(cat1.run(100));
        debug(cat1.jump(2));
        debug(cat2.swim(1));

        Dog dog1 = new Dog("Дружок");
        Dog dog2 = new Dog("Шарик");
        debug(dog1.jump(0.5f));
        debug(dog2.run(500));

        Dog dog3 = new Dog("Тузик");
        dog3.setMaxRunLength(800);
        debug(dog3.swim(10));
        debug(dog3.run(800));
    }

    private static void debug(boolean result) {
        System.out.println("=> " + (result ? "true" : "false"));
    }
}
