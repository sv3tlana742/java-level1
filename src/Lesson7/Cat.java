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
        if (p.decreaseFood(appetite) == true) {
            System.out.println("Кот " + name + " съел " + appetite + " еды");
        } else{
            System.out.println("Коту " + name + " не хватило еды");
        }

    }

}
