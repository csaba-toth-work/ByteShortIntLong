package debuggerandunittesting.debugger;

public class StringUtilities {

    private StringBuilder sbuilder = new StringBuilder();
    private int charsAdded = 0;

    public void addChar(StringBuilder sBuilder, char c) {
        this.sbuilder.append(c);
        charsAdded++;
    }

    public String upperAndPrefix(String str) {
        String upper = str.toUpperCase();
        return "Prefix " + upper;
    }

    public String addSuffix(String str) {
        return str + "_Suffix";
    }
}
