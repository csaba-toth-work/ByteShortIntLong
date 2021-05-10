package expressionsstatementscodeblocksmethods;

public class KeywordsAndExpressions {
    public static void main(String[] args) {
        // 53 reserved keywords reserved by Java (if, float, dobule, do, then...)
        double kilometres = (100 * 1.609344); // kilometres = (100 * 1.609344 is the expression part of the line
        int highScore = 50; // highscore = 50 is the expression part of the line

        if (highScore == 50){
            System.out.println("This is an expression");
        }

        int score = 100;
        if (score > 99) {
            System.out.println("You got the high score!");
            score = 0;
        }

    }
}
