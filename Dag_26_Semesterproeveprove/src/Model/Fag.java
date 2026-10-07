package Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Fag {
    private String navn;
    private String klasse;
    //Linkattributter
    private ArrayList<Lektion> lektioner;


    public Fag(String navn, String klasse) {
        this.navn = navn;
        this.klasse = klasse;
        ArrayList<Lektion> lektioner = new ArrayList<>();
    }

    public String getNavn() {
        return navn;
    }

    public String getKlasse() {
        return klasse;
    }

    public ArrayList<Lektion> getLektioner() {
        return new ArrayList<>(lektioner);
    }

    public void addLektion(Lektion lektion) {
        if (!lektioner.contains(lektion)) {
            lektioner.add(lektion);
        }
    }

    //Tilføj til klassen Fag metoden sygdomPåDato(LocalDate dato), det skal returnere en ArrayList med
    //de studerende der har fået registreret sygdom på den pågældende dato. En studerende må kun
    //forekomme en gang i listen.
    public ArrayList<Student> sygdomPåDato(LocalDate dato) {
        ArrayList<Student> eleverFraværSygdom = new ArrayList<>();
        for (Lektion lektion : lektioner) {
            if (lektion.getDato() == dato) {
                for (Deltagelse deltagelse : lektion.getDeltagelser()) {
                    if (deltagelse.getStatus() == DeltagerStatus.SYG && !eleverFraværSygdom.contains(deltagelse.getStuderende())) {
                        eleverFraværSygdom.add(deltagelse.getStuderende());
                    }
                }
            }
        }
        return eleverFraværSygdom;
    }
}
