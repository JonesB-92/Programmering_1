import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        //area = radius * radius * 3.14159;

        //Create scanner
        Scanner keyboardType = new Scanner(System.in);

        //Prompt user to enter a radius
        System.out.println("Enter the radius ");
        //Read a double for radius
        double radius = keyboardType.nextDouble();


        //Compute area
        double area = radius * radius * 3.14159;
        //Announce the area of the circle
        System.out.println("The area of the circle with radius " + radius + " is " + area);



        //2.4.1 i bogen: Which identifiers are valid?
        //miles, Test, a++, ––a, 4#R, $4, #44, apps, class, public, int
        //2.5.1
        //int i = k +2;
        //System.out.println(i);


        //2.6 Keypoint
        int y = 1; // Assign 1 to variable y
        int x = 5 * (3 / 2); // Assign the value of the expression to x
        x = y + 1; // Assign the addition of y and 1 to x --> x bliver her REdefineret, så den er y (1) + 1 = 2, da den tager
        //statements eller programmet generelt helt kronologisk

        double raadius = 1.0; // Assign 1.0 to variable radius
        double aarea = raadius * raadius * 3.14159; // Compute area

        System.out.println(x + " " + aarea);

        //x = x +1

        x = x + 1;
        x = x +1;

        System.out.println(x);

        //2.6.1 Identify and fix the error

        /*int i = j = k = 2;
        System.out.println(i + " " + j + " " + k);*/

        int i, j, k;
        j = 2;
        i = j;
        k = i;

        System.out.println(i + " " + j + " " + k);

    }
}
