package kyu7;

/*Create a function that returns the sum of the two lowest positive numbers
given an array of minimum 4 positive integers.
No floats or non-positive integers will be passed.

        For Java, those integers will come as double precision (long).

        For example, when an array is passed like [19, 5, 42, 2, 77], the output should be 7.

        [10, 343445353, 3453445, 3453545353453] should return 3453455.*/

public class SumTwoSmallestNumbers {
    public static void main(String[] args) {
        System.out.println(sumTwoSmallestNumbers(new long[]{15, 28, 4, 2, 43}));
    }

    public static long sumTwoSmallestNumbers(long[] numbers) {
        long n1 = Long.MAX_VALUE;
        long n2 = Long.MAX_VALUE;

        for (long number : numbers) {
            if (number < n1) {
                n2 = n1;
                n1 = number;
            } else if (number < n2) {
                n2 = number;
            }
        }

        return n1 + n2;
    }
}