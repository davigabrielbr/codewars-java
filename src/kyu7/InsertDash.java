package kyu7;

/*Write a function that takes an integer num (num >= 0)
and inserts dashes ('-') between each two odd digits in num.

        Examples
454793 ---> "4547-9-3"
        0 ---> "0"
        1 ---> "1"
        13579  ---> "1-3-5-7-9"
        86420 ---> "864208*/

public class InsertDash {
    public static void main(String[] args) {
        System.out.println(insertDash(454793));
    }

    public static String insertDash(int num) {
        String number = String.valueOf(num);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < number.length(); i++) {
            char current = number.charAt(i);

            result.append(current);

            if (i < number.length() - 1) {
                char next = number.charAt(i + 1);

                int currentDigit = Character.getNumericValue(current);
                int nextDigit = Character.getNumericValue(next);

                if (currentDigit % 2 != 0 && nextDigit % 2 != 0) {
                    result.append("-");
                }
            }
        }

        return result.toString();
    }
}