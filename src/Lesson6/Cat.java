package Lesson6;

public class Cat extends Animal {
    public Cat(String name) {
        super("Кот", name, 200, 2, 0);
    }

    @Override
    public boolean swim(float length) {
        System.out.println("Коты не умеют плавать");
        return false;
    }
}
