import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> elements = buildElementListFromScanner(scanner);

    }

    private static List<Integer> buildElementListFromScanner(Scanner scanner) {
        int listElementCount = scanner.nextInt();
        List<Integer> elements = new ArrayList<>();

        for (int i = 0; i < listElementCount; i++) {
            elements.add(scanner.nextInt());
        }

        return elements;
    }
}
