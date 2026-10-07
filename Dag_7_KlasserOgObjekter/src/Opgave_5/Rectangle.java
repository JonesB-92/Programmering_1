package Opgave_5;

public class Rectangle {
    //[YL] Opgave 9.1 og 9.2 (Attributter skal laves private tilføj også get-metoder og
    //toString() metoder til klasserne)
    /*
■ Two double data fields named width and height that specify the width and
height of the rectangle. The default values are 1 for both width and height.
■ A no-arg constructor that creates a default rectangle.
■ A constructor that creates a rectangle with the specified width and height.
■ A method named getArea() that returns the area of this rectangle.
■ A method named getPerimeter() that returns the perimeter*/

    private String name;
    private double width = 1;
    private double height = 1;

    //Constructor default rect, no args!
    public Rectangle() {

    }
    //Creates rectangle with the specified width and height.
    public Rectangle(String name, double width, double height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        double area = width * height;
        return area;
    }

    public double getPerimeter() {
        double perimeter = (width + height) * 2;
        return perimeter;
    }
    public void printRectangle() {
        System.out.println("******");
        System.out.println(name);
        System.out.println("Width = " + width + "\nHeight = " + height);
        System.out.println("Area = " + getArea() + "\nPerimeter = " + getPerimeter());

    }
    //"The reason it must be named toString() is because that's the method that Java will automatically call when
    //you try to print an object or use it in a string context (like concatenating with other strings)."
    @Override
    public String toString() {
        return name + "\nWidth = " + width + "\nHeight = " + height + "\nArea = " + getArea() + "\nPerimeter = " +
                getPerimeter();
    }
}
