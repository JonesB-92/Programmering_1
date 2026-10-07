package Opgave_4;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Hund> hunde = new ArrayList<>();

        Hund belki = new Hund(true, 10000, Race.TERRIER);
        Hund sødHund = new Hund(false, 5000, Race.BOKSER);
        Hund grimHund = new Hund(true, 25000, Race.PUDDEL);
        Hund hund = new Hund(true, 50000, Race.PUDDEL);
        Hund hund1 = new Hund(false, 1000, Race.BOKSER);

        Collections.addAll(hunde, belki, sødHund, grimHund, hund, hund1);

        System.out.println("Samlet pris for Terrier: " + samletPris(hunde, Race.TERRIER));
        System.out.println("Samlet pris for Bokser: " + samletPris(hunde, Race.BOKSER));
        System.out.println("Samlet pris for Puddel: " + samletPris(hunde, Race.PUDDEL));

    }

    public static int samletPris(ArrayList<Hund> hunde, Race race) {
        int samletPris = 0;

        for (Hund hund : hunde) {
            if (hund.getRace() == race)
                samletPris += hund.getPris();
        }
        return samletPris;
    }

}

