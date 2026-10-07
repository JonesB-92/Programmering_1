package Storage;

import Model.Fag;
import Model.Student;

import java.util.ArrayList;

public class Storage {
    //Tilføj klassen Storage i pakken storage. Klassen skal indeholde lister med fag og studerende.
    private static ArrayList<Fag> subjects = new ArrayList<>();
    private static ArrayList<Student> students = new ArrayList<>();

    //Klassen skal også indeholde metoder til at gemme objekter af klasserne Fag og Studerende, og
    public static void addSubjects(Fag subject) {
        if (!subjects.contains(subject)) {
            subjects.add(subject);
        }
    }

    public static void addStudents(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    //metoder til at hente alle fag og studerende. Lav ikke metoder til at slette objekterne fra Storage.
    public static ArrayList<Fag> getSubjects() {
        return new ArrayList<>(subjects);
    }

    public static ArrayList<Student> getStudents() {
        return new ArrayList<>(students);
    }
}
