package Opgaver;

public class Opgave_1_2 {
    /* 2. Lav en for-løkke der udskriver alle multiplum af 3 fra 300 ned til 3.
Dvs: 300, 297, 294 …6, 3.*/

    public static void main(String[] args) {
        for (int i = 300; i >= 3; i = i - 3) {
            System.out.println(i);
        }
    }
}



