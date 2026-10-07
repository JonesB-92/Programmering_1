public class E_Checkpoint2_7_1 {
    //checkpoint 2.7.1  Declare an int constant SIZE with value 20.
    public static void main(String[] args) {
        final int SIZE = 20;

        /* 2.7.2 Translate the following algorithm into Java code:
        Step 1: Declare a double variable named miles with an initial value 100.*/
        double miles = 100;

        //Step 2: Declare a double constant named KILOMETERS_PER_MILE with value 1.609.
        final double KILOMETERS_PER_MILE = 1.609;

        //Step 3: Declare a double variable named kilometers, multiply miles and KILOMETERS_PER_MILE, and assign the result to kilometers.
        double kilometers = miles * KILOMETERS_PER_MILE;

        //Step 4: Display kilometers to the console.
        System.out.println(kilometers);

        //What is kilometers after Step 4?
        //1.609 - 160.9* selvfølgelig, fordi det er 100 mil i kilometer...


        //Random stuff. Det giver 0 btw
        System.out.println(1/2);
    }
}
