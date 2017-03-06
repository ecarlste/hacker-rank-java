import java.util.*;

public class Solution {

    private enum QueryType {
        INSERT("Insert"),
        DELETE("Delete");

        private final String name;

        QueryType(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> elements = buildElementListFromScanner(scanner);

        elements = performAllQueriesOnElementListFromScanner(elements, scanner);

    }

    private static List<Integer> performAllQueriesOnElementListFromScanner(List<Integer> elements, Scanner scanner) {
        int queryCount = scanner.nextInt();

        for (int i = 0; i < queryCount; i++) {
            QueryType queryType = getQueryTypeFromScanner(scanner);
        }

        return null;
    }

    private static QueryType getQueryTypeFromScanner(Scanner scanner) {
        QueryType queryType;
        String queryTypeString = scanner.next();

        if (queryTypeString.equals("Insert")) {
            queryType = QueryType.INSERT;
        } else {
            queryType = QueryType.DELETE;
        }

        return queryType;
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
