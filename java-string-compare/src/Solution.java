import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String entireString = scanner.next();
        int substringLength = scanner.nextInt();

        List<String> substrings = new ArrayList<>();
        int maxSubstringStart = entireString.length() - substringLength + 1;
        
        for (int start = 0; start < maxSubstringStart; start++) {
            int end = start + substringLength;
            
            String currentSubstring = entireString.substring(start, end);
            substrings.add(currentSubstring);
        }
        
        Collections.sort(substrings);
        
        System.out.println(substrings.get(0));
        System.out.println(substrings.get(substrings.size() - 1));

    }
}