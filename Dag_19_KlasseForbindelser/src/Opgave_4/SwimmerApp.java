package Opgave_4;

import java.util.ArrayList;
import java.util.Arrays;

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


        //. Lav en afprøvklasse og prøv
        //kompositionen af ved at lave et objekt af TrainingPlan og derefter et antal objekter af Swimmer
        TrainingPlan trainingPlanA = new TrainingPlan('A', 20, 16);

        Swimmer s4 = trainingPlanA.createSwimmer("Jones", 1992, lapTimes, "AAK");
        Swimmer s5 = trainingPlanA.createSwimmer("Morten", 2020, lapTimes, "Bøgsklub");
        Swimmer s6 = trainingPlanA.createSwimmer("Mikkel", 1993, lapTimes, "AIA-Tranbjerg");
        Swimmer s7 = trainingPlanA.createSwimmer("Bo", 1995, lapTimes, "Lyseng");
        Swimmer s8 = trainingPlanA.createSwimmer("Jan", 1994, lapTimes, "AGF");

        //b. Check at linkmetoderne virker ved at udskrive svømmerne på træningsplanobjektet
        System.out.println(trainingPlanA.getSwimmers());

        System.out.println(" ----------------- \n\n\n\n");
        //c. Fjern en svømmer fra træningsplanen. Check igen om objekterne er knyttet rigtigt sammen.
        trainingPlanA.removeSwimmer(s4);
        System.out.println(trainingPlanA.getSwimmers());
        System.out.println(trainingPlanA.getSwimmers().contains(s4));

    }

}
