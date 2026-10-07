package Opgave_4;

public class Hund {
    //Lav en klasse Hund der har attributterne:
    //• navn der en String
    //• stamtavle der er en boolean
    //• pris der er et heltal
    //• race der er af typen Race
    private String navn;
    private boolean stamTavle;
    private int pris;
    private Race race;

    public Hund(boolean stamTavle, int pris, Race race){
        this.stamTavle = stamTavle;
        this.pris = pris;
        this.race = race;
    }

    public int getPris(){
        return pris;
    }

    public Race getRace(){
        return race;
    }

}
