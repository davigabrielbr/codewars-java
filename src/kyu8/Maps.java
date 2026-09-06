package kyu8;

/*Given an array of integers, return a new array with each value doubled.

For example:

[1, 2, 3] --> [2, 4, 6]*/

import java.util.Arrays;

public class Maps {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(map(new int[]{1, 2, 3})));
    }

    public static int[] map(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] * 2;
        }

        return result;
    }
}