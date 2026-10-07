public class Unavngiven_underviser_1 {
    /*6, 6, 8 + 15, 16, 18

    2 madpakker/dag i 200 dage på et FOLKESKOLEår. Børn smører selv madpakker når 10>.
     */
    /*Skriv et program, der beregner gennemsnitsalderen for underviserens børn (hhv. piger, drenge og samlet)*/
    public static void main(String[] args) {
        int[] drengeAldre = {6, 6, 8};
        int[] pigeAldre = {15, 16, 18};

        //Piger
        System.out.print(("(15 + 16 + 18) / 3 = "));
        System.out.println((15 + 16 + 18) / 3.0);
        int sumP = 0;
        double gnmsntPiger = 0;
        for (int i = 0; i < pigeAldre.length; i++) {
            sumP += pigeAldre[i];
        }
        gnmsntPiger = sumP / (double) pigeAldre.length;
        System.out.println(gnmsntPiger);

        //Drenge
        System.out.print(("(6 + 6 + 8) / 3 = "));
        System.out.println(((6 + 6 + 8)) / 3.0);
        int sumD = 0;
        double gnmsntDrenge = 0;
        for (int i = 0; i < pigeAldre.length; i++) {
            sumD += drengeAldre[i];
        }
        gnmsntDrenge = sumD / (double) drengeAldre.length;

        System.out.println(gnmsntDrenge);

        //Samlet
        System.out.print(("(15 + 16 + 18 + 6 + 6 + 8) / 6 = "));
        System.out.println(((15 + 16 + 18 + 6 + 6 + 8)) / 6.0);

        double gnmstSamlet = (sumP + sumD) / (double) (drengeAldre.length + pigeAldre.length);
        System.out.println(gnmstSamlet);

        /*Skriv et program, der beregner hvor mange madpakker underviseren har smurt til nytår
        (det kan antages, at alle børn har fødselsdag i juli)

        Juli=7/12=5 mdr. til nytår dvs. de to børn på 6 år har 5 mdr hver til nytår.
        --> 5*2 = 10mdr. 20 skoledage pr mdr.= 20*10=200 skoledage. 2 madpakker pr skoledag= 2*200=400
        */


    }
}
