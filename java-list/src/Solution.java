import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> elements = buildElementListFromScanner(scanner);
        performAllQueriesOnElementListFromScanner(elements, scanner);

        scanner.close();

        outputListAsSpaceSeparatedElements(elements);
    }

    private static void performAllQueriesOnElementListFromScanner(List<Integer> elements, Scanner scanner) {
        int queryCount = scanner.nextInt();

        for (int i = 0; i < queryCount; i++) {
            QueryType queryType = getQueryTypeFromScanner(scanner);
            performQueryOnListByTypeFromScanner(elements, queryType, scanner);
        }
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

    private static void performQueryOnListByTypeFromScanner(List<Integer> elements, QueryType queryType,
                                                                     Scanner scanner) {
        if (queryType == QueryType.INSERT) {
            performInsertOnListFromScanner(elements, scanner);
        } else {
            performDeleteOnListFromScanner(elements, scanner);
        }
    }

    private static void performInsertOnListFromScanner(List<Integer> elements, Scanner scanner) {
        int insertIndex = scanner.nextInt();
        int insertElement = scanner.nextInt();
        elements.add(insertIndex, insertElement);
    }

    private static void performDeleteOnListFromScanner(List<Integer> elements, Scanner scanner) {
        int deleteIndex = scanner.nextInt();
        elements.remove(deleteIndex);
    }

    private static List<Integer> buildElementListFromScanner(Scanner scanner) {
        int listElementCount = scanner.nextInt();
        List<Integer> elements = new ArrayList<>();

        for (int i = 0; i < listElementCount; i++) {
            elements.add(scanner.nextInt());
        }

        return elements;
    }

    private static void outputListAsSpaceSeparatedElements(List<Integer> elements) {
        for (int i = 0; i < elements.size(); i++) {
            if (i == 0) {
                System.out.print(elements.get(i));
            } else {
                System.out.print(" " + elements.get(i));
            }
        }
    }

    private enum QueryType {
        INSERT, DELETE
    }

}
