package Lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (p.decreaseFood(appetite)) {
            satiety = true;
            System.out.println("Кот " + name + " съел " + appetite + " еды");
        } else {
            satiety = false;
            System.out.println("Коту " + name + " не хватило еды");
        }
    }

    public void info() {
        if (satiety) {
            System.out.println("Кот " + name + " сытый");
        } else {
            System.out.println("Кот " + name + " голоден");
        }
    }
}
