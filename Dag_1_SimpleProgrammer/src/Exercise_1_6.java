public class Exercise_1_6

/*(Summation of a series) Write a program that displays the result of
1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10. */

{
    public static void main(String[] args) {
        System.out.println("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10=");
        System.out.println(1+2+3+4+5+6+7+8+9+10);

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += array[i];
        }

        System.out.println(sum);
    }
}
