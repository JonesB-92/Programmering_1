package Model;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.sql.Array;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;

public class Vagt {
    private String navn;
    private LocalDateTime tidFra;
    private LocalDateTime tidTil;
    //Linkatt
    private ArrayList<Medarbejder> medarbejdere;
    private ArrayList<Antal> vagtsAntal;

    public Vagt(String navn, LocalDateTime tidFra, LocalDateTime tidTil) {
        this.navn = navn;
        this.tidFra = tidFra;
        this.tidTil = tidTil;
        this.medarbejdere = new ArrayList<>();
        this.vagtsAntal = new ArrayList<>();
    }

    //Komposition:
    private Antal createAntal(int antal, Funktion funktion) {
        Antal antalAfDenneFunktion = new Antal(antal, funktion);
        //Adde til arrayliste
        vagtsAntal.add(antalAfDenneFunktion);

        return antalAfDenneFunktion;
    }

    public String getNavn() {
        return navn;
    }

    public LocalDateTime getTidFra() {
        return tidFra;
    }

    public LocalDateTime getTidTil() {
        return tidTil;
    }

    //Linkmetoder --------------------------------------------

    public ArrayList<Medarbejder> getMedarbejdere() {
        return new ArrayList<>(medarbejdere);
    }

    public void addMedarbejder(Medarbejder medarbejder) {
        if (!medarbejdere.contains(medarbejder)) {
            medarbejdere.add(medarbejder);
            medarbejder.addVagtPåMedarbejder(this);
        }
    }

    public ArrayList<Antal> getVagtsAntal() {
        return new ArrayList<>(vagtsAntal);
    }

    public void addVagtsAntal(Antal antal) {
        if (vagtsAntal.contains(antal)) {
            vagtsAntal.add(antal);
        }
    }

    //Opgave 2
    //Tilføj til klassen Vagt en metode.
    //Metoden skal returnere en medarbejder, som møder på det angivne tidspunkt, og arbejder
    //MINDST det angivne antal timer. Hvis en sådan medarbejder ikke findes, skal metoden returnere null.
    public Medarbejder findMedarbejder(LocalTime tidspunkt, int antalTimer) {
        Medarbejder fundetmedarbejder = null;

        for (Medarbejder medarbejder : getMedarbejdere()) {
            if (medarbejder.getTypiskMødetid().equals(tidspunkt) && medarbejder.getAntalTimerPrDag() >= antalTimer) {
                fundetmedarbejder = medarbejder;
            }
        }
        return fundetmedarbejder;
    }

    //Opgavw 3 (5 point)
    //Når der løbende laves regnskab, skal køkkenchefen kunne aflæse det samlede timeforbrug for en
    //given vagt, forstået som antallet af tilknyttede medarbejdere ganget med vagtens varighed.
    //Tilføj til klassen Vagt en metode beregnTimeforbrug() : int, der returnerer vagtens
    //samlede timeforbrug afrundet opad til nærmeste hele time.
    public int beregnTimeforbrug() {
        int samledeTimeforbrug = 0;
        int antalMedarbejderePåVagt = this.medarbejdere.size();
        int varighed = (int) ChronoUnit.HOURS.between(this.tidFra, this.tidTil);

        samledeTimeforbrug = antalMedarbejderePåVagt * varighed;

        return samledeTimeforbrug;

    }

    //Opgave 4
    //Tilføj til klassen Vagt en metode
    //Metoden skal returnere antal medarbejdere (kun antal(int) eller medarbejdere så man kan se hvem? OPGAVE 6 siger int) tilknyttet vagten med den angivne funktion.
    public int antalMedarbejdereMedFunktion(Funktion funktion) {
        int antalMedarbejdereMedFunktion = 0;

        for (Medarbejder medarbejder : this.getMedarbejdere()) {
            if (medarbejder.getMedarbejdersFunktioner().contains(funktion)) {
                antalMedarbejdereMedFunktion++;
            }
        }
        return antalMedarbejdereMedFunktion;
    }

    //Opgave	S5 (5 point)
    //Medarbejdere kan ved oprettelse få registreret deres typiske mødetid i kantinen. Ved nogle vagter
    //er det vigtigt, at der tages højde for, at alle tilknyttede medarbejdere er til stede fra vagtens start.
    //Tilføj til klassen Vagt en metode skalAdviseresOmMødetid() : Medarbejder[], der
    //returnerer et array med de medarbejdere på vagten, som har typisk mødetid senere end vagtens start tid.
    public Medarbejder[] skalAdviseresOmMødetid() {
        int antalMedarbejdere = this.medarbejdere.size();
        Medarbejder[] medarbejdereDerStarterSenere = new Medarbejder[antalMedarbejdere];

        int i = 0;
        for (Medarbejder medarbejder : this.getMedarbejdere()) {
            if (medarbejder.getTypiskMødetid().isAfter(this.tidFra.toLocalTime())) {
                medarbejdereDerStarterSenere[i] = medarbejder;
                i++;
            }
        }
        
        //Then at the end, if you want to return only the filled part of the array (without nulls), you can do:
        return Arrays.copyOf(medarbejdereDerStarterSenere, i);

    }
}
