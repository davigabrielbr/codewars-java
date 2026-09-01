package kyu8;

public class SquareSum {
    public static void main(String[] args) {
        int[] n = {1, 2, 2};

        System.out.println(squareSum(n));
    }

    public static int squareSum(int[] n) {
        int soma = 0;

        for (int i = 0; i < n.length; i++) {
            n[i] = n[i] * n[i];
            soma += n[i];
        }

        return soma;
    }
}