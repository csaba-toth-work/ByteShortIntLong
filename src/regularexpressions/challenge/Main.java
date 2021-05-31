package regularexpressions.challenge;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String challenge1 = "I want a bike.";
        String challenge2 = "I want a ball.";

        System.out.println(challenge1.matches("I want a bike."));

        String regExp = "I want a \\w+.";
        System.out.println(challenge1.matches(regExp));
        System.out.println(challenge2.matches(regExp));
        String regExp1 = "I want a (bike|ball).";
        System.out.println(challenge1.matches(regExp1));
        System.out.println(challenge2.matches(regExp1));

        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());
        Matcher matcher2 = pattern.matcher(challenge2);
        System.out.println(matcher2.matches());


        String challenge4 = "Replace all blanks with underscores.";
        System.out.println(challenge4.replaceAll(" ", "_"));

        String challenge5 = "aaabccccccccdddefffg";
        System.out.println(challenge5.matches("^a{3}bc{8}d{3}ef{3}g$"));
        System.out.println(challenge5.matches("[abcdefg]+"));
        System.out.println(challenge5.matches("[a-g]+"));
        System.out.println(challenge5.replaceAll("^a{3}bc{8}d{3}ef{3}g$", "REPLACED"));

        String challenge7 = "abcd.135";
        System.out.println(challenge7.matches("^[A-Z][a-z]+\\.\\d+$"));


    }
}
