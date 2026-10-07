public class Exercise_1_8

/* 1.8 (Area and perimeter of a circle)
Write a program that displays the area and perimeter of a
circle that has a radius of 6.5 using the following formula:

p = 3.14159
perimeter = 2 * radius * p
area = radius * radius * p */ {
    public static void main(String[] args) {
        System.out.println(
                "p = 3.14159 --- R= 6.5\n" +
                "perimeter = 2 * radius * p\n" +
                "area = radius * radius * p\n");

        System.out.print("Perimeter=2*6.5*3.14159=");
        System.out.println(2 * 6.5 * 3.14159);
        System.out.println(" ");

        System.out.println("A=R^2*Pi");
        System.out.print("A=(6.5)^2*3.14159=");
        System.out.println(((6.5 * 6.5) * 3.14159));
    }

}
