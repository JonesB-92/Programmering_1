package Opgaver;

public class Opgave_1 {
    /* Opgave 1
    a) Lav en klasse med en main() metode. Programmer i main() metoden en while-løkke, som summerer alle lige
    tal mellem 2 og 100 (begge inklusive).(Resultatet skal være 2450 (2550!!!).) */

    public static void main(String[] args) {

        int x = 2;
        int sum = 0;

        while (x <= 100) {
            if (x % 2 == 0) {
                System.out.println(x);
                sum += x;
            }
            x++;
        }
        System.out.println(sum);

    }
}
