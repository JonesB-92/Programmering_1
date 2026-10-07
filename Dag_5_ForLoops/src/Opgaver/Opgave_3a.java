package Opgaver;

public class Opgave_3a {
    /* I klassen Stars (fra Canvas) finder du eksemplet med stjerner gennemgået på
    klassen i dag. Udvid klassen med metoder der tegner nedenstående.
    De fire versioner skal lave nedenstående fire tegninger */

    final static int MAX_ROWS = 10;

    public static void starPicture() {
        System.out.println();
        for (int row = 1; row <= MAX_ROWS; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void starPictureA() {
        System.out.println();
        for (int row = 1; row <= MAX_ROWS; row++) {
            for (int star = 10; star >= row; star--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void starPictureB() {
        System.out.println();
        for (int row = 1; row <= MAX_ROWS; row++) {
            for (int space = 1; space <= (MAX_ROWS - row); space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void starPictureC() {
        System.out.println();
        for (int row = 1; row <= MAX_ROWS; row++) {
            for (int space = 1; space <= (row - 1); space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (MAX_ROWS - row + 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    } //ELLER

    public static void starPictureC1() {
        int max_rows = 10;
        for (int rows = 1; rows <= max_rows; rows++) {
            for (int stars = 1; stars <= max_rows; stars++) {
                if (stars >= rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

       /* public static void starPictureD() {
            System.out.println();
            for (int row = 1; row <= MAX_ROWS; row++) {
                for (int space = 1; space <=; space++) {
                    System.out.print(" ");
                }
                for (int star = 1; star <=; star++) {
                    System.out.print("*");
                }
                System.out.println();

            }
        }*/


//        public static void main (String[]args){
//        starPicture();
//        starPictureA();
//        starPictureB();
//        starPictureC();
//            starPictureD();
//        }

    }
}



