package Opgave_5;

import java.util.ArrayList;
import java.util.HashSet;

public class Series {
    private String title;
    private ArrayList<String> cast;
    private ArrayList<Episode> episodes;

//    Opgave 5.2
//    Implementér kompositionen mellem Series og Episode. Du skal også tilføje en konstruktor til
//    klassen Episode. Konstruktøren for Episode skal initialisere alle attributter i klassen.
    public Series(String title, ArrayList<String> cast) {
        this.title = title;
        this.cast = cast;
        episodes = new ArrayList<>();
    }

    public Episode createEpisode(int number, ArrayList<String> guestActors, int lengthMinutes) {
        Episode episode = new Episode(number, guestActors, lengthMinutes);
        episodes.add(episode);
        return episode;
    }

    public ArrayList<Episode> getEpisodes() {
        return new ArrayList<>(episodes); // ✅ Encapsulation preserved
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<String> getCast() {
        return new ArrayList<>(cast); // ✅ Encapsulation preserved
    }

    public String seriesToString(){
        String name = getTitle();
        String cast = getCast().toString();
        String episodes = getEpisodes().toString();//Kan ikke bruge dette da Episode ikke er en indbygget klasse i Java
        //Kan enten override Episodens toString metode i Episode klassen, men man kan også det her (?): */
//        StringBuilder episodesInString = new StringBuilder();
//        for (Episode episode : getEpisodes())
//            episodesInString.append(episode.getNumber());
        //Nope nvm

        return "\nTitle: " + name + "\n" +
                "Starring: " + cast + "\nGuest actors: " + getTotalGuestActors() +
                "\nNumber of episodes " + getEpisodes().size() + "\n" +
                "\nTotal number of minutes: " + getTotalLength();
    }

    //Opgave 5.3 Programmér følgende metode tilhørende klassen Series:

    /**
     * Return the total length (in minutes) of all the
     * episodes in the series.
     */
    public int getTotalLength() {
        int totalLength = 0;

        for (Episode episode : episodes) {
            totalLength += episode.getLengthMinutes();
        }
        return totalLength;
    }

//    Opgave 5.4 Programmér følgende metode tilhørende klassen Series:
    /**
     * Return the total list of all guest actors from all
     * episodes.
     */
    public ArrayList<String> getTotalGuestActors() {
        //A HashSet<String> ensures that all guest actors
        //in the final list are unique because a HashSet does not allow duplicate values.
        HashSet<String> uniqueGuestActors = new HashSet<>();

        for (Episode episode : episodes) {
            uniqueGuestActors.addAll(episode.getGuestActors());
        }
        return new ArrayList<>(uniqueGuestActors); //Convert back to list
    }

    //ELLER
    /**
    public ArrayList<String> getAllGuestActors() {
        ArrayList<String> uniqueGuestActors = new ArrayList<>();

        for (Episode episode : episodes) {
            for (String actor : episode.getGuestActors()) {
                if (!uniqueGuestActors.contains(actor)) { // Check for duplicates
                    uniqueGuestActors.add(actor);
                }
            }
        }
        return new ArrayList<>(uniqueGuestActors); // Return a copy for encapsulation
    }*/
}
