package Opgave_3;

import java.util.ArrayList;

public class SwimmerApp {
    
    public static void main(String[] args) {

        ArrayList<Double> lapTimes = new ArrayList<>();
        lapTimes.add(1.02);
        lapTimes.add(1.01);
        lapTimes.add(0.99);
        lapTimes.add(0.98);
        lapTimes.add(1.02);
        lapTimes.add(1.04);
        lapTimes.add(0.99);
        Swimmer s1 = new Swimmer("Jan", 1994, lapTimes, "AGF");

        lapTimes = new ArrayList<>();
        lapTimes.add(1.05);
        lapTimes.add(1.01);
        lapTimes.add(1.04);
        lapTimes.add(1.06);
        lapTimes.add(1.08);
        lapTimes.add(1.04);
        lapTimes.add(1.02);
        Swimmer s2 = new Swimmer("Bo", 1995, lapTimes, "Lyseng");

        lapTimes = new ArrayList<>();
        lapTimes.add(1.03);
        lapTimes.add(1.01);
        lapTimes.add(1.02);
        lapTimes.add(1.05);
        lapTimes.add(1.03);
        lapTimes.add(1.06);
        lapTimes.add(1.03);
        Swimmer s3 = new Swimmer("Mikkel", 1993, lapTimes, "AIA-Tranbjerg");
        
        ArrayList<Swimmer> swimmers = new ArrayList<>();
        swimmers.add(s1);
        swimmers.add(s2);
        swimmers.add(s3);

        for (Swimmer s : swimmers) {
            System.out.println(s.getName() + "'s bedste tid: " + s.bestLapTime());
        }

        TrainingPlan trainingPlanA = new TrainingPlan('A', 16, 10);
        TrainingPlan trainingPlanB = new TrainingPlan('B', 10, 6);

        //f. Tilføj til main metoden i SwimmerApp den kode der skal til, for at Jan og Bo er tilknyttet
        //planen på level ’A’ og Mikkel til planen på level ’B’
        s1.setTrainingPlan(trainingPlanA);
        s2.setTrainingPlan(trainingPlanA);
        s3.setTrainingPlan(trainingPlanB);

        s3.setTrainingPlan(null);
        //h. Tilføj til klassen SwimmerApp kode der beregner og udskriver hvor mange timer om ugen
        //svømmerne i listen træner i alt.
        int totalTrainingHours = 0;
        for (Swimmer s : swimmers) {
            totalTrainingHours += s.allTrainingHours();
        }
        System.out.println("Alle svømmeres samlede ugentlige træningstid: " + totalTrainingHours );
    }

}
