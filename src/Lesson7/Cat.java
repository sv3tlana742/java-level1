package Lesson7;

public class Cat {
    private String name;
    private int appetite;
    private Plate plate;


    public Cat (String name, int appetite){
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p){
        p.decreaseFood(appetite);
        System.out.println("Кот " + name + " съел " + appetite + " еды");
    }
}
