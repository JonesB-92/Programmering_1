package Opgave_3;

import java.util.ArrayList;

public class Swimmer {
    private String name;
    private String club;
    private int yearGroup;
    private ArrayList<Double> lapTimes;
    //DOBBELTRETTET
    private TrainingPlan trainingPlan;

    /**
     * Initialize a new swimmer with name, club, yearGroup, and lap times.
     */

    public Swimmer(String name, int yearGroup, ArrayList<Double> lapTimes, String club) {
        this.name = name;
        this.yearGroup = yearGroup;
        this.lapTimes = lapTimes;
        this.club = club;
    }

    /**
     * Return the name of the swimmer
     */
    public String getName() {
        return this.name;
    }

    /**
     * Return the yearGroup of the swimmer
     */
    public int getYearGroup() {
        return this.yearGroup;
    }

    /**
     * Return the club of the swimmer
     */
    public String getClub() {
        return this.club;
    }

    /**
     * Register the club of the swimmer
     *
     * @param club
     */
    public void setClub(String club) {
        this.club = club;
    }

    public TrainingPlan getTrainingPlan() {
        return trainingPlan;
    }

    public void setTrainingPlan(TrainingPlan newTrainingPlan) {
        if (this.trainingPlan != newTrainingPlan) {
            if (this.trainingPlan != null) {
                this.trainingPlan.removeSwimmer(this);
            }
            this.trainingPlan = newTrainingPlan;
            if (newTrainingPlan != null) {
                newTrainingPlan.addSwimmer(this);
            }
        }
    }

    public void removeTrainingPlan(TrainingPlan trainingPlan) {
        if (this.trainingPlan == trainingPlan) {
            this.setTrainingPlan(null);
            trainingPlan.removeSwimmer(this);
        }
    }

    /**
     * Return the fastest lap time
     */
    public double bestLapTime() {
        double best = Double.MAX_VALUE;
        for (double time : lapTimes) {
            if (best > time) {
                best = time;
            }
        }
        return best;
    }

    //g. Tilføj til klassen Swimmer metoden:

    /**
     * Return how many training hours the swimmer has each week.
     */
    public int allTrainingHours() {
        if (trainingPlan != null) {
            return trainingPlan.getWeeklyWaterHours() + trainingPlan.getWeeklyStrengthHours();
        }
        return 0;
    }
}
