package Lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (p.decreaseFood(appetite)) {
            satiety = true;
            System.out.println("Кот " + name + " съел " + appetite + " еды" + " => " + satiety);
        } else {
            satiety = false;
            System.out.println("Коту " + name + " не хватило еды" + " => " + satiety);
        }
    }

    public void info() {
        if (satiety == true) {
            System.out.println("Кот " + name + " сытый");
        } else {
            System.out.println("Кот " + name + " голоден");
        }
    }
}
