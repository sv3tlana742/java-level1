package Lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n) {
        if (food >= n){
            food -= n;
            return true;
        } return false;
    }

    public void info(){
        System.out.println("Food: " + food);
    }

    public void addFood() {
        if()
    }
}