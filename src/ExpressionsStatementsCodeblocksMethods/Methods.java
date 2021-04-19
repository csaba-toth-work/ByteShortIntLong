package ExpressionsStatementsCodeblocksMethods;

public class Methods {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);

        // or a more simple way

        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);

        displayHighScorePosition("John", calculateHighScorePosition(1500));
        displayHighScorePosition("Ian", calculateHighScorePosition(900));
        displayHighScorePosition("Peter", calculateHighScorePosition(400));
        displayHighScorePosition("Ema", calculateHighScorePosition(50));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + ". on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }
        return 4;
    }
    public static int calculateHighScorePosition2 (int score) {  // alternative way to do the same
        int position = 4; // assuming position 4 will be returned

        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score  >= 100) {
            return 3;
        }

        return position;
    }
}
