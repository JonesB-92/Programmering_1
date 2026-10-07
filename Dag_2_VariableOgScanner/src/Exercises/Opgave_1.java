package Exercises;

public class Opgave_1
{
    public static void main(String[] args)
    {

        int i1, i2, a = 4, b = 11, c = 2;
        double d1, d2, r = 4.0, s = 11.0, t = 2.0;

        i1 = b / a;          System.out.println(i1);
        c = (int) (s/r);     System.out.println(c);
        d1 = b / a;          System.out.println(d1);
        d1 = (double) b/a;   System.out.println(d1);
        d2 = s / r ;         System.out.println(d2);
        d1 = b / r ;         System.out.println(d1);
        d2 = 11.0/4.0;       System.out.println(d2);
        d1 = 11.0 / a * c;   System.out.println(d1);
        System.out.println("Den dividerer her med a og ganger derefter det hele med c");
        d1 = 11.0 / (a * c); System.out.println(d1);
        i1++;                System.out.println(i1);
        //++ tager altså bare variablen +1!
        d1++;                System.out.println(d1);
        i1= b % a;           System.out.println(i1);
        i1= 3+7*2;           System.out.println(i1);
        i2 = (3+7) * 2;      System.out.println(i2);
    }
}
