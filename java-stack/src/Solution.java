import java.util.*;

class Solution {

    private enum InputTokenType {
        PARENTHESES, CURLY_BRACE, SQUARE_BRACE, INVALID;

        public static InputTokenType getInputTokenTypeForCharacter(String token) {
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

            List<String> tokens = splitInputStringIntoSingleTokenStrings(input);

            boolean isBalancedTokenList = checkTokenListForBalance(tokens);

            System.out.println(isBalancedTokenList);
        }

    }

    private static List<String> splitInputStringIntoSingleTokenStrings(String input) {
        String[] tokenArray = input.split("(?!^)");

        return Arrays.asList(tokenArray);
    }

    private static boolean checkTokenListForBalance(List<String> tokens) {
        Stack<InputTokenType> tokenTypeStack = new Stack<>();

        for (String token : tokens) {
            InputTokenType tokenType = InputTokenType.getInputTokenTypeForCharacter(token);

            if (isOpeningToken(token)) {
                tokenTypeStack.push(tokenType);
            }

            if (isClosingToken(token)) {
                try {
                    InputTokenType lastOpeningToken = tokenTypeStack.pop();

                    if (tokenType != lastOpeningToken) {
                        return false;
                    }
                } catch (EmptyStackException exception) {
                    return false;
                }

            }
        }

        return tokenTypeStack.isEmpty();
    }

    private static boolean isOpeningToken(String token) {
        return token.equals("(") || token.equals("{") || token.equals("[");
    }

    private static boolean isClosingToken(String token) {
        return token.equals(")") || token.equals("}") || token.equals("]");
    }

}
