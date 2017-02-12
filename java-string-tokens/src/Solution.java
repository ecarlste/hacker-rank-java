import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        splitStringIntoTokens(s);

        scan.close();
    }

    static List<String> splitStringIntoTokens(String s) {
        String regex = "[ !,?._'@]+";
        String[] tokens = s.split(regex);

        return Arrays.asList(tokens);
    }
}
