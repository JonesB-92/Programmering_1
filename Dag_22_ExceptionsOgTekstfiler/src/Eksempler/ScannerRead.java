package Eksempler;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerRead {

    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\j0int\\OneDrive\\Datamatiker\\IntelliJ Kodning\\Idea Projects\\Programmering_1\\Dag_22_ExceptionsOgTekstfiler\\src\\Eksempler\\helloworld.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.print(scanner.nextLine() + " ");
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
