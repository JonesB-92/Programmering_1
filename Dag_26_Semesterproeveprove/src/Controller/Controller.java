package Controller;

import Model.Fag;
import Model.Lektion;
import Model.Student;
import Storage.Storage;

import javax.security.auth.Subject;
import java.time.LocalDate;
import java.time.LocalTime;

public class Controller {
    //Klassen skal indeholde metoder til at oprette objekter af klasserne Studerende, Fag og Lektion.
    public static Student createStudent(String navn, String email) {
        Student student = new Student(navn, email);
        Storage.addStudents(student);
        return student;
    }

    public static Fag createFag(String navn, String klasse) {
        Fag fag = new Fag(navn, klasse);
        Storage.addSubjects(fag);
        return fag;
    }

    public static Lektion createLektion(LocalDate dato, LocalTime startTid, String lokale, Fag fag){
        Lektion lektion = new Lektion(dato, startTid, lokale, fag);
        return lektion;
    }

    // Tilføj derudover en metode
    //initStorage(), der under anvendelse af opret-metoderne opretter og gemmer data svarende til
    //nedenstående:
    public static void initStorage() {
        createStudent("Peter Hansen", "ph@stud.dk");
        createStudent("Tina Jensen", "tj@stud.dk");
        createStudent("Sascha Petersen", "sp@stud.dk");

        createFag("Pro1", "20S");
        createFag("Pro1", "20t");
        createFag("SU1", "20S");

        createLektion(LocalDate.of(2021, 2,1), LocalTime.of(10, 30), "A1.32", Storage.getSubjects().get(0));
        createLektion(LocalDate.of(2021, 2,3), LocalTime.of(8, 30), "A1.32", Storage.getSubjects().get(1));
        createLektion(LocalDate.of(2021, 2,3), LocalTime.of(10, 30), "A1.32", Storage.getSubjects().get(2));



    }



}
