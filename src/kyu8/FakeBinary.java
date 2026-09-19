package kyu8;

/*Given a string of digits, you should replace any digit below 5 with '0'
and any digit 5 and above with '1'. Return the resulting string.

Note: input will never be an empty string*/

public class FakeBinary {
    public static void main(String[] args) {
        System.out.println(fakeBin("45385593107843568"));
    }

    public static String fakeBin(String numberString) {
        StringBuilder stringBuilder = new StringBuilder();

        for (char c : numberString.toCharArray()) {
            if (c < '5') {
                stringBuilder.append('0');
            } else {
                stringBuilder.append('1');
            }
        }

        return stringBuilder.toString();
    }
}