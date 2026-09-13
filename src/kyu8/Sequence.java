package kyu8;

/*Build a function that returns an array of integers from n to 1 where n>0.
        Example : n=5 --> [5,4,3,2,1]*/

import java.util.Arrays;

public class Sequence {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(5)));
    }

    public static int[] reverse(int n) {
        int[] reverse = new int[n];

        for (int i = n; i >= 1; i--) {
            reverse[n - i] = i;
        }

        return reverse;
    }
}