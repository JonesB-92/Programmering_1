package Model;

public class Antal {
    private int antal;
    //Linkattributter
    private Funktion antalsFunktion;


    public Antal(int antal, Funktion funktion) {
        this.antal = antal;
        this.antalsFunktion = funktion;
    }

    public int getAntal() {
        return antal;
    }

    //Linkmetoder
    public Funktion getAntalsFunktion() {
        return antalsFunktion;
    }
}
