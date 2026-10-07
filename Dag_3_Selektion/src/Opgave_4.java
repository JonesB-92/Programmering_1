import java.util.Scanner;

public class Opgave_4 {

    // Metoden skal returnerer en tekststreng der beskriver hvilken institution et barn skal gå i, afhængig af barnets alder.
    //0 Home
    //1-2 Nursery
    //3-5 Kindergarten
    //6-16 School
    //17- Out of school

    //Hvilken institution
    public static String institution(int age) {
        String institution;

        if (age == 0) {
            return "Home";
        } else if (age > 0 && age <= 2) {
            return "Nursery";
        } else if (age >= 3 && age <= 5) {
            return "Kindergarten";
        } else if (age >= 6 && age <= 16) {
            return "School";
        } else if (age > 16) {
            return "Out of school";
        } else {
            return "Error 404: Int not found.";
        }
    }

//Opgave 5
// Metoden skal returner en tekststreng der beskriver hvilket gymnastikhold et barn skal gå på
// afhængig af barnets alder og køn.
//Girl <8 Tumbling girls
// >=8 Springy girls
//Boy <8 Young cubs
// >=8 Cool boys
    public static String team(boolean isBoy, int age) {

        if(!isBoy && age < 8) {
            return "Tumbling Girls";
        }
        if(isBoy && age < 8) {
            return "Young Cubs";
        }
        if (!isBoy && age >= 8) {
            return "Springy Girls";
        }
        if (isBoy && age >= 8) {
            return "Cool Boys";
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast alderen på dit djævlebarn.");
        int age = scanner.nextInt();
        System.out.println("Barnets alder er " + age + " og skal derfor gå i " + institution(age).toLowerCase());

        //Scanner til opgave 5?
        System.out.println("Is your son a boy? True or false.");
        boolean isBoy = scanner.nextBoolean();
        System.out.println(team(isBoy, age));

    }
}


