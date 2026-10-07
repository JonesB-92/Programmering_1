package PairProgramming;

import javafx.scene.paint.Color;

public class Car {
    private Color color;
    private int doors;
    private int wheels;

    public Car (Color color, int doors, int wheels) {
        this.color = color;
        this.doors = doors;
        this.wheels = wheels;
    }

    public Car () {
        this(Color.YELLOW, 1, 3);
    }

    public Color getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public String toString(){
        String carInfo = "";
        carInfo += "Color: " + color;
        carInfo += "\n Amount of doors: " + doors;
        carInfo += "\n Amount of wheels: " + wheels;

        return carInfo;
    }
}
