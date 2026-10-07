package Opgave_2;

public class Opgave_2 {
    //Opgave 2
    //Denne opgave går ud på at lave en fletning af to arrays indeholdende heltal.
    //1. Programmér en klasse med en main() metode.
    public static void main(String[] args) {
        //I main() metoden lav to arrays, fx {2, 4, 6, 8, 10, 12, 14} og {1, 2, 4, 5, 6, 9, 12, 17}
        int[] array1 = {2, 4, 6, 8, 10, 12, 14};
        int[] array2 = {1, 2, 4, 5, 6, 9, 12, 17};

        //3. Kald metoden fællesTal med de to arrays som parameter.
        fællesTal(array1, array2);

        //4. Udskriv resultatet af ovenstående kald. Dette skulle gerne være {2, 4, 6, 12}.

    }

    //2. Programmér følgende metode i klassen som en generel fletning.
    public static int[] fællesTal(int[] l1, int[] l2) {
        int[] fællestTal = new int[l1.length + l2.length];

        int i1 = 0;
        int i2 = 0;
        int j = 0;
        while (i1 < l1.length && i2 < l2.length) {
            if (l1[i1] != l2[i2]) {
                i2++;
            } else {
                fællestTal[i1] = l1[i1];
                i2++;
            }
        }


        return fællestTal;
    }
}
