package kyu8;

/**
 * Create a function which answers the question "Are you playing banjo?".
 * If your name starts with the letter "R" or lower case "r", you are playing banjo!
 *
 * The function takes a name as its only argument, and returns one of the following strings:
 *
 * name + " plays banjo"
 * name + " does not play banjo"
 *
 * Names given are always valid strings.
 */

public class AreYouPlayingBanjo {
    public static void main(String[] args) {
        String name = "Rikke";
        System.out.println(areYouPlayingBanjo(name));
    }

    public static String areYouPlayingBanjo(String name) {
        char firstLetter = name.charAt(0);

        if (firstLetter == 'R' || firstLetter == 'r') {
            return name + " plays banjo";
        } else {
            return name + " does not play banjo";
        }
    }
}