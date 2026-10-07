import java.util.Scanner;

public class BooleanComputeAreaWithConsole {
    public static void main(String[] args) {
        //3.1
        final double PI = 3.14159;

        //Hent scanner
        Scanner input = new Scanner(System.in);

        //Bruger erklærer radius
        double radius = input.nextDouble();
        //erklær regnestykket og definer PI som constant
        double area = Math.pow(radius, 2) * PI;
        double aarea = radius * radius * PI;
        System.out.println(aarea);

        //Boolean, så man ikke kan smide negativ double
        if (radius < 0 ) {
            System.out.println("Try again.");

        } else {
            System.out.println("The circle area with radius " + radius + " is " + area);
        }
    }
}
