package Model;

import java.util.ArrayList;

public class Student {
    private String navn;
    private String email;

    //link
    private ArrayList<Deltagelse> participation;

    public Student(String navn, String email) {
        this.navn = navn;
        this.email = email;
        participation = new ArrayList<>();
    }

    //Dobbeltrettet
    public void addDeltagelse(Deltagelse deltagelse) {
        if(!participation.contains(deltagelse)) {
            participation.add(deltagelse);
            deltagelse.setStuderende(this);
        }
    }

    public String getNavn() {
        return navn;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Deltagelse> getParticipation() {
        return new ArrayList<>(participation);
    }

    //Tilføj til klassen Studerende metoden antalFraværsLektioner(): int, der returnerer antallet
    //af lektioner, den studerende har været registreret fraværende.
    public int antalFraværsLektioner() {
        int fravær = 0;

        for(Deltagelse deltagelse : participation) {
            if(deltagelse.erRegistreretFraværende()) {
                fravær++;
            }
        }
        return fravær;
    }
}
