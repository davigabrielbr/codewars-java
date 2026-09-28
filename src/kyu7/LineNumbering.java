package kyu7;

        /*Your team is writing a fancy new text editor and
        you've been tasked with implementing the line numbering.

        Write a function which takes a list of strings and
        returns each line prepended by the correct number.

        The numbering starts at
        1. The format is n: string.
        Notice the colon and space in between.

        Examples: (Input --> Output)

        [] --> []
        ["a", "b", "c"] --> ["1: a", "2: b", "3: c"]*/

import java.util.ArrayList;
import java.util.List;

public class LineNumbering {
    public static void main(String[] args) {
        System.out.println(number(List.of("a", "b", "c")));
    }

    public static List<String> number(List<String> lines) {
        ArrayList<String> result = new ArrayList<>();
        int counter = 1;

        for (String line : lines) {
            result.add(counter + ": " + line);
            counter++;
        }

        return result;
    }
}