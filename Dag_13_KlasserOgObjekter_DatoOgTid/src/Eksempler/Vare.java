package Eksempler;

public class Vare {
    private String navn;
    private double pris;
    private static int momsProcent = 25;

    public Vare(String navn, double pris) {
        this.navn = navn;
        this.pris = pris;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public static int getMomsProcent() {
        return momsProcent;
    }

    public static void setMomsProcent(int momsProcent) {
        Vare.momsProcent = momsProcent;
    }

    public double getPrisInklMoms() {
        return this.pris * (1 + (momsProcent / 100.0));
    }
}
