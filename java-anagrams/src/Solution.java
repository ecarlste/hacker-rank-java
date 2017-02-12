import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by ecarl on 2/10/2017.
 */
public class Solution {

    public static void main(String[] args) {
        String a = "myooN";
        String b = "ynoom";

        Boolean isAnagram = isAnagram(a, b);

        System.out.println(isAnagram);
    }

    static boolean isAnagram(String a, String b) {
        List<String> splitA = Arrays.asList(a.toLowerCase().split("(?!^)"));
        List<String> splitB = Arrays.asList(b.toLowerCase().split("(?!^)"));

        Collections.sort(splitA);
        Collections.sort(splitB);

        return splitA.equals(splitB);
    }

}
