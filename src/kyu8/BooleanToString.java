package kyu8;

/*Implement a function which convert the given boolean value into its string representation.

Note: Only valid inputs will be given.*/

public class BooleanToString {
    public static void main(String[] args) {
        System.out.println(convert(true));
    }

    public static String convert(boolean b) {
        return String.valueOf(b);
    }
}