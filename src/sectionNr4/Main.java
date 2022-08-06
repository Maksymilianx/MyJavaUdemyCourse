package sectionNr4;

public class Main {

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(
                name + " managed to get into position " + position + " on the high score table"
        );
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;
        if (score >= 1000) position = 1;
        else if (score >= 500) position = 2;
        else if (score >= 100) position = 3;
        return position;
        }

    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Kuba", highScorePosition);
        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Robert", highScorePosition);
        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Daniel", highScorePosition);
        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Byku", highScorePosition);
        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Rollo", highScorePosition);
        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Hans", highScorePosition);
        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Sergej", highScorePosition);
    }
}

