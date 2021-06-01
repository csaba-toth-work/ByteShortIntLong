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
        System.out.println(challenge7.matches("^[A-z][a-z]+\\.\\d+$"));


        String challenge8 = "abcd.135uvqz.7tzik.999";
        String groupPattern8 = "[A-z][a-z]+\\.(\\d+)";
        Pattern pattern8 = Pattern.compile(groupPattern8);
        Matcher matcher8 = pattern8.matcher(challenge8);

        while (matcher8.find()) {
            System.out.println("Occurrence: " + matcher8.group(1));
        }


        String challenge9 = "abcd.135\tuvqz.7\ttzik.999\n";
        String groupPattern9 = "[A-z][a-z]+\\.(\\d+)\\s";
        Pattern pattern9 = Pattern.compile(groupPattern9);
        Matcher matcher9 = pattern9.matcher(challenge9);

        while (matcher9.find()) {
            System.out.println("Occurrence: " + matcher9.group(1));
        }


        String challenge10 = "abcd.135\tuvqz.7\ttzik.999\n";
        String groupPattern10 = "[A-z][a-z]+\\.(\\d+)\\s";
        Pattern pattern10 = Pattern.compile(groupPattern10);
        Matcher matcher10 = pattern10.matcher(challenge10);
        while (matcher10.find()) {
            System.out.println(matcher10.start(1) + " to " + (matcher10.end(1) - 1));
        }

        String challenge11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
        String groupPattern11 = "\\{(.+?)\\}";
        Pattern pattern11 = Pattern.compile(groupPattern11);
        Matcher matcher11 = pattern11.matcher(challenge11);
        while (matcher11.find()) {
            System.out.println(matcher11.group(1));
        }


        String challenge12 = "11111";
        System.out.println(challenge12.matches("^\\d{5}$"));


        String challenge13 = "11111-1111";
        System.out.println(challenge13.matches("^\\d{5}-\\d{4}$"));

        String regexp = "^\\d{5}(-\\d{4})?$";
        System.out.println(challenge12.matches(regexp));
        System.out.println(challenge13.matches(regexp));


    }
}
