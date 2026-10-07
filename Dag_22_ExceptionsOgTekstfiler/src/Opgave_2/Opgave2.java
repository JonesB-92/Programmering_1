package Opgave_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Opgave2 {

    //Opgave 2
    //Lav med notesblokken i Windows en fil med en række heltal.
    public static void main(String[] args) {
        //Lav en applikation der i main-metoden læser denne fil, og udskriver det dobbelte af tallene i
        //konsolvinduet.
        try {
            File file = new File("C:\\Users\\j0int\\OneDrive\\Datamatiker\\IntelliJ Kodning\\Idea Projects\\Programmering_1\\Dag_22_ExceptionsOgTekstfiler\\src\\Opgave_2\\talNotePadOpg2.txt");
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNext()) {
                String number = fileScanner.nextLine();
                System.out.println(number);

                int numberAsInt = Integer.parseInt(number);
                System.out.println("til ");
                System.out.println(numberAsInt * 2 + "\n");
            }
            fileScanner.close();
        } catch (FileNotFoundException e1) {
            System.out.println(e1);
        } catch (InputMismatchException e2) {
            System.out.println(e2 + "Tekstfilen indeholder bogstaver.");
        } catch (IOException e) {
            System.out.println(e);
        }
        //68
        //-40
        //0
        //400
        //354
        //570
    }

}
