package Model;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Lektion {
    private LocalDate dato;
    private LocalTime startTid;
    private String lokale;
    //Link
    ArrayList<Deltagelse> deltagelser;

    //Fag SKAL med i const. parameter, da den skal have ét og kun ét fag men intet linkattribut, da associeringen er ensrettet?
    public Lektion(LocalDate dato, LocalTime startTid, String lokale, Fag fag) {
        this.dato = dato;
        this.startTid = startTid;
        this.lokale = lokale;
        deltagelser = new ArrayList<>();
        fag.addLektion(this);
    }

    public Deltagelse createDeltagelse(Lektion lektion, Student studerende) {
        Deltagelse deltagelse = new Deltagelse(lektion, studerende);
        deltagelser.add(deltagelse);
        return deltagelse;
    }

    public void addDeltagelse(Deltagelse deltagelse) {
        if(!deltagelser.contains(deltagelse)) {
            deltagelser.add(deltagelse);
        }
    }

    public LocalDate getDato() {
        return dato;
    }

    public LocalTime getStartTid() {
        return startTid;
    }

    public String getLokale() {
        return lokale;
    }

    public ArrayList<Deltagelse> getDeltagelser() {
        return new ArrayList<>(deltagelser);
    }
}
