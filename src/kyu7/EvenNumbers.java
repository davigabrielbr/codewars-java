package kyu7;

/*Given an array of numbers, return a new array of length number containing
        the last even numbers from the original array (in the same order).
        The original array will be not empty and will contain at least "number" even numbers.

        For example:

        ([1, 2, 3, 4, 5, 6, 7, 8, 9], 3) => [4, 6, 8]
        ([-22, 5, 3, 11, 26, -6, -7, -8, -9, -8, 26], 2) => [-8, 26]
        ([6, -25, 3, 7, 5, 5, 7, -3, 23], 1) => [6]*/

import java.util.Arrays;

public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(evenNumbers(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 3)));
    }

    public static int[] evenNumbers(int[] arr, int n) {
        int[] numbers = new int[n];
        int index = n - 1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                numbers[index] = arr[i];
                index--;
            }

            if (index < 0) break;
        }

        return numbers;
    }
}