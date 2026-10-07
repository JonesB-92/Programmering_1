import java.util.Scanner;

public class D_ComputeAreaWithConstant {
    public static void main(String[] args) {
        //area = R * R * PI

        //Skaber scanner
        Scanner input = new Scanner(System.in);
        //Prompter bruger til at enter R
        System.out.println("Enter the radius of the circle.");

        //Giver bruger adgang til tastaturet
        double radius = input.nextDouble();

        //Definér konstanten PI
        //final datatype CONSTANTNAME = value
        final double PI = 3.14159;

        //Compute
        double area = radius * radius * PI;

        //Prompt
        System.out.println("The area of the circle is " + area + " cm.");

        final String LIGNING = "The area of the circle, defined as area = radius * radius * Pi, is " + area + " cm";

        System.out.println(LIGNING);

    }
}
