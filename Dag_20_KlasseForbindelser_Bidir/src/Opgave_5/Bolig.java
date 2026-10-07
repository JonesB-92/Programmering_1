package Opgave_5;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bolig {
    private int kvm;
    private String adresse;
    private int prisPrMåned;

    private Kollegie kollegie;
    private ArrayList<Lejeaftale> lejeaftaler;

    public Bolig(int kvm, String adresse, int prisPrMåned, Kollegie kollegie) {
        this.kvm = kvm;
        this.adresse = adresse;
        this.prisPrMåned = prisPrMåned;
        this.kollegie = kollegie;
    }

    public void setKollegie(@NotNull Kollegie nytKollegie) {
        if (kollegie != nytKollegie) {
            nytKollegie.removeBolig(this);
            kollegie = nytKollegie;
            kollegie.addBolig(this);
        }
    }

    public Lejeaftale createLejeAftale(LocalDate fraDato, Bolig bolig) {
        Lejeaftale lejeaftale = new Lejeaftale(fraDato, bolig);
        lejeaftaler.add(lejeaftale);
        return lejeaftale;
    }

    public void opsigeLejeAftale(Lejeaftale lejeaftale, LocalDate opsigelsesDato) {
        if (lejeaftale.getTilDato() == null) {
            lejeaftale.setTilDato((opsigelsesDato));
        }
    }

    public ArrayList<Lejeaftale> getLejeaftaler() {
        return new ArrayList<>(lejeaftaler);
    }
}

