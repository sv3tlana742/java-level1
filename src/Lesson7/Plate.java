package Lesson7;

import javax.jws.soap.SOAPMessageHandlers;

public class Plate {
    private int food;
    private boolean empty;

    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
//        if (food >= n){
            food -= n;
//        }
    }

    public void info(){
        System.out.println("Food: " + food);
    }

    public boolean isEmpty(){
        return empty;
    }
}