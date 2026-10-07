package Opgave_5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //For at lave en serie skal jeg først lave et cast, da min series constructor skal bruge en
        ArrayList<String> castBB = new ArrayList<>();
        castBB.add("Bryan Cranston");
        castBB.add("Anna Gunn");
        castBB.add("Aaron Paul");
        castBB.add("Dean Norris");
        //Serie
        Series BB = new Series("Breaking Bad", castBB);
        //Tester
        System.out.println(BB.getCast());
        System.out.println(BB.seriesToString());

        //Laver nogle episoder og skal i episode constructormetoden også bruge guestactors arraylist
        ArrayList<String> guestActorsEp1 = new ArrayList<>();
        guestActorsEp1.add("Danny Trejo");
        guestActorsEp1.add("Robert Forster");
        guestActorsEp1.add("Krysten Ritter");

        BB.createEpisode(1, guestActorsEp1,58);
        //Teste
        System.out.println("---------------- EPISODE 1 ----------------");
        System.out.println(BB.getTotalLength());
        System.out.println(BB.getTotalGuestActors());
        System.out.println("Number of episodes: " + BB.getEpisodes().size());
        System.out.println(BB.seriesToString());

        ArrayList<String> guestActorsEp2 = new ArrayList<>();
        guestActorsEp2.add("Max Arciniega");
        guestActorsEp2.add("John Koyama");
        guestActorsEp2.add("Marius Stan");
        guestActorsEp2.add("Carmen Serano");
        guestActorsEp2.add("Tess Harper");

        ArrayList<String> guestActorsEp3 = new ArrayList<>();
        guestActorsEp3.add("Jessica Hecht");
        guestActorsEp3.add("Steven Michael Quezada");
        BB.seriesToString();

        BB.createEpisode(2, guestActorsEp2,48);
        System.out.println(BB.seriesToString());

        BB.createEpisode(3, guestActorsEp3,48);
        System.out.println(BB.seriesToString());

    }
}