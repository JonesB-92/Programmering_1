package Opgave_5;

import java.awt.image.AreaAveragingScaleFilter;
import java.time.LocalDate;
import java.util.ArrayList;

public class Lejeaftale {
    private LocalDate fraDato;
    private LocalDate tilDato = null;
    private Lejer lejer;
    private Lejer lejer1;
    private ArrayList<Lejer> lejere;
    private Bolig bolig;

    public Lejeaftale(LocalDate fraDato, Bolig bolig){
        this.fraDato = fraDato;
        this.bolig = bolig;
    }

    public void setTilDato(LocalDate tilDato) {
        this.tilDato = tilDato;
    }

    public Bolig getBolig() {
        return bolig;
    }

    public void setBolig(Bolig bolig) {
        this.bolig = bolig;
    }

    public Lejer getLejer() {
        return lejer;
    }

    /** Kan gøre sådan her */
    public void setLejer(Lejer lejer){
        this.lejer = lejer;
    }
    public void setLejer1(Lejer lejer1){
        this.lejer = lejer1;
    }

    /** Eller sådan her vha. en ArrayListe */
    public void setLejereList(Lejer lejer1, Lejer lejer2) {
        ArrayList<Lejer> lejere = new ArrayList<>();
        lejere.add(lejer1);
        lejere.add(lejer2);
        this.lejere = lejere;
    }

    public LocalDate getTilDato() {
        return tilDato;
    }

    public LocalDate getFraDato() {
        return fraDato;
    }

    public void setFraDato(LocalDate fraDato) {
        this.fraDato = fraDato;
    }
}
