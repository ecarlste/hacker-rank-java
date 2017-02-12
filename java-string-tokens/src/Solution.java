import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        List<String> tokens = splitStringIntoTokens(s);

        printTokens(tokens);

        scan.close();
    }

    static List<String> splitStringIntoTokens(String s) {
        String regex = "[ !,?._'@]+";
        String trimmedString = s.trim();

        if (trimmedString.length() == 0) {
            return new ArrayList<>();
        } else {
            String[] tokens = trimmedString.split(regex);
            return Arrays.asList(tokens);
        }
    }

    private static void printTokens(List<String> tokens) {
        System.out.println(tokens.size());
        for (String token : tokens) {
            System.out.println(token);
        }
    }

}
