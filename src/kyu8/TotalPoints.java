package kyu8;

/*Our football team has finished the championship.

Our team's match results are recorded in a collection of strings.
Each match is represented by a string in the format "x:y",
where x is our team's score and y is our opponents score.

For example: ["3:1", "2:2", "0:1", ...]

Points are awarded for each match as follows:

if x > y: 3 points (win)
if x < y: 0 points (loss)
if x = y: 1 point (tie)
We need to write a function that takes this collection and
returns the number of points our team (x) got in the championship by the rules given above.

Notes:

our team always plays 10 matches in the championship
0 <= x <= 4
0 <= y <= 4*/

public class TotalPoints {
    public static void main(String[] args) {
        System.out.println(points(new String[]{"1:1", "2:2", "3:3", "4:4", "5:5", "6:6", "7:7", "8:8", "9:9", "10:10"}));
    }

    public static int points(String[] games) {
        int x = 0;

        for (String game : games) {
            String[] result = game.split(":");

            int ourTeamScore = Integer.parseInt(result[0]);
            int opponentScore = Integer.parseInt(result[1]);

            if (ourTeamScore > opponentScore) {
                x += 3;
            } else if (ourTeamScore == opponentScore) {
                x += 1;
            }
        }

        return x;
    }
}