package Opgaver;

import javax.swing.plaf.nimbus.State;

public class Exercise_4 {
    /* To the ArrayTest class, add a method
         public static boolean hasUneven(int[] t)
    that returns true, if t includes at least one uneven number.
    If t = {4,6,7,2,3}, true must be returned; if t = {4,6,8,2,6}, false must be returned.
    Test your method in main(). */

    public static void main(String[] args) {
        int[] t = {4, 6, 7, 2, 3};
        int[] t1AlphaAsFuck = {4, 6, 8, 2, 6};

        System.out.println(hasUneven(t));
        System.out.println(hasUneven(t1AlphaAsFuck));
    }


    public static boolean hasUneven(int[] t) {
        Boolean result = false;
        for (int i = 0; i < t.length; i++) {
            if (t[i] % 2 != 0) {
                result = true;
            } else result = false;
        }
        return result;
    }
}



