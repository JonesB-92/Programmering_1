package Opgave_5;

public class RectangleApp {
    /* Draw the UML diagram for the class then implement the class.
    Write a test program that creates two Rectangle objects—one with width 4 and height 40, and
    the other with width 3.5 and height 35.9. Display the width, height, area, and
    perimeter of each rectangle in this order*/


    public static void main(String[] args) {
        //Creating two objects of the class Rectangle
        Rectangle rectangle1 = new Rectangle("rect 1", 4, 40);
        Rectangle rectangle2 = new Rectangle("rect 2", 3.5, 35.9);
        //Kan OGSÅ bruge setters til at indsætte de forskellige værdier i stedet for at give objektet parametre!

        //Display width and height
        rectangle1.printRectangle();
        System.out.println();
        rectangle2.printRectangle();
        System.out.println();

        //ELLER gennem toString()
        System.out.println(rectangle1);
        System.out.println();
        System.out.println(rectangle2);
    }
}
