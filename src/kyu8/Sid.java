package kyu8;

/*This kata is about multiplying a given number by eight
if it is an even number and by nine otherwise.*/

public class Sid {
    public static void main(String[] args) {
        System.out.println(simpleMultiplication(3));
    }

    public static int simpleMultiplication(int n) {
        if (n % 2 == 0) {
            return n * 8;
        } else {
            return n * 9;
        }
    }
}