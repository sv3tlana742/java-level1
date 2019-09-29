package Lesson6;

public class Animal {
    private String kindOfAnimal;
    private String name;
    private float runLength;
    private float jumpHeight;
    private float swimLength;

    public Animal(String kindOfAnimal, String name, float runLength, float jumpHeight, float swimLength) {
        this.kindOfAnimal = kindOfAnimal;
        this.name = name;
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
        this.swimLength = swimLength;
    }

    public boolean run(float length) {
        return action(length, runLength, "пробежал");
    }

    public boolean swim(float length) {
        return action(length, swimLength, "проплыл");
    }

    public boolean jump(float height) {
        return action(height, jumpHeight, "прыгнул");
    }

    public void setMaxRunLength(float length) {
        runLength = length;
    }

    private boolean action(float length, float max, String action) {
        if (length <= max) {
            System.out.println(kindOfAnimal + " " + name + " " + action + " " + length + " метра(ов)");
            return true;
        }
        return false;
    }
}
