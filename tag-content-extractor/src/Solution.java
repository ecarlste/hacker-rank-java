import java.util.*;
import java.util.regex.*;

public class Solution{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();

            Matcher matcher = buildXmlTagExtractionMatcher(line);
            findAndPrintXmlElementsUsingMatcher(matcher);

            testCases--;
        }
    }

    private static Matcher buildXmlTagExtractionMatcher(String line) {
        String regex = "<(.+)>([^<>]+)</\\1>";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(line);
    }

    private static void findAndPrintXmlElementsUsingMatcher(Matcher matcher) {
        int matchesFound = 0;
        while(matcher.find())
        {
            System.out.println(matcher.group(2));
            matchesFound++;
        }

        if(matchesFound == 0){
            System.out.println("None");
        }
    }
}
