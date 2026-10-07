package Opgave_5;

import java.util.ArrayList;

public class Kollegie {
    private String navn;
    private String adresse;
    private ArrayList<Bolig> boliger;

    //Add create og remove
    public void addBolig(Bolig bolig) {
        if (!boliger.contains(bolig)) {
            boliger.add(bolig);
            bolig.setKollegie(this);
        }
    }

    public Bolig createBolig(int kvm, String adresse, int prisPrMåned) {
        Bolig nyBolig = new Bolig(kvm, adresse, prisPrMåned, this);
        return  nyBolig;
    }

    public void removeBolig(Bolig bolig){
        if(boliger.contains(bolig)) {
            boliger.remove(bolig);
        }
    }

    //Spørgsmål 5.2
    //Tilføj til klassen Kollegie en metode getAntalLejeAftaler(), der returnerer hvor mange
    //lejeaftaler der er registreret på kollegiet.(Både lejeaftaler med og uden tilDato skal tælles med)
//    public int getAntalLejeAftaler() {
//
//    }


}
