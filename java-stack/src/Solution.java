import java.util.*;

class Solution {

    private enum InputTokenType {
        PARENTHESES, CURLY_BRACE, SQUARE_BRACE, INVALID;

        public InputTokenType getInputTokenTypeForCharacter(String token) {
            switch (token) {
                case "(":
                case ")":
                    return PARENTHESES;
                case "{":
                case "}":
                    return CURLY_BRACE;
                case "[":
                case "]":
                    return SQUARE_BRACE;
            }

            return INVALID;
        }
    }

    public static void main(String []argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();

            System.out.println(input);
            //Complete the code
        }

    }
}
