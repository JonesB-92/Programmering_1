package Opgave_2;

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

        //b. Lav en ny SwimmerApp klasse, som opretter to svømmere og en træningsplan og sætter
        //svømmerne som svømmere på planen.
        TrainingPlan trainingPlanA = new TrainingPlan('A', 16,10);

        trainingPlanA.addSwimmer(s1);
        trainingPlanA.addSwimmer(s2);

        //c. Udvid SwimmingApp-klassen, så du ud fra TRÆNINGSPLANEN finder de svømmere, som er
        //tilknyttet planen, og udskriver informationer om hver svømmer på skærmen.
        for( Swimmer s : trainingPlanA.getSwimmers()) {
            System.out.println(s.getName() + "s bedste tid: " + s.bestLapTime());
        }

    }
    
}
