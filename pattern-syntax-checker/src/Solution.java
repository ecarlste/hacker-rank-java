import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            printPatternValidity(pattern);
        }
    }

    static boolean checkRegularExpressionIsValid(String regex) {
        try {
            Pattern.compile(regex);
        } catch(PatternSyntaxException exception) {
            return false;
        }

        return true;
    }

    private static void printPatternValidity(String pattern) {
        if (checkRegularExpressionIsValid(pattern)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

}
