package Model;

import java.time.LocalTime;
import java.util.ArrayList;

public class Medarbejder {
    private String navn;
    private int antalTimerPrDag;
    private LocalTime typiskMødetid;
    //Linkattributter
    private ArrayList<Vagt> medarbejdersVagter;
    private ArrayList<Funktion> medarbejdersFunktioner;


    public Medarbejder(String navn, int antalTimerPrDag, LocalTime typiskMødetid) {
        this.navn = navn;
        this.antalTimerPrDag = antalTimerPrDag;
        this.typiskMødetid = typiskMødetid;
        this.medarbejdersVagter = new ArrayList<>();
        this.medarbejdersFunktioner = new ArrayList<>();
    }

    public String getNavn() {
        return navn;
    }

    public int getAntalTimerPrDag() {
        return antalTimerPrDag;
    }

    public LocalTime getTypiskMødetid() {
        return typiskMødetid;
    }



    //Linkmetoder ----------------------------------------------

    public ArrayList<Vagt> getMedarbejdersVagter() {
        return new ArrayList<>(medarbejdersVagter);
    }

    public void addVagtPåMedarbejder(Vagt vagt) {
        if(!medarbejdersVagter.contains(vagt)){
            medarbejdersVagter.add(vagt);
            vagt.addMedarbejder(this);
        }
    }

    public ArrayList<Funktion> getMedarbejdersFunktioner() {
        return new ArrayList<>(medarbejdersFunktioner);
    }

    public void addFunktionPåMedarbejder(Funktion funktion) {
        if (!medarbejdersFunktioner.contains(funktion)) {
            medarbejdersFunktioner.add(funktion);
        }
    }
}
