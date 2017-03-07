import java.util.*;

class Solution{

    private static Map<String, Integer> phoneBook = new HashMap<>();
    private static List<String> namesToSearch = new ArrayList<>();

    public static void main(String []argh)
    {
        buildPhoneBookAndNamesToSearch();
        searchForNamesInPhoneBookAndPrintResults();
    }

    private static void searchForNamesInPhoneBookAndPrintResults() {
        for (String name : namesToSearch) {
            outputPhoneBookSearchResultForName(name);
        }
    }

    private static void outputPhoneBookSearchResultForName(String name) {
        if (phoneBook.containsKey(name)) {
            System.out.println(name + "=" + phoneBook.get(name));
        } else {
            System.out.println("Not found");
        }
    }

    private static void buildPhoneBookAndNamesToSearch() {
        Scanner scanner = new Scanner(System.in);

        buildPhoneBookFromScanner(scanner);
        buildNamesToSearchFromScanner(scanner);

        scanner.close();
    }

    private static void buildPhoneBookFromScanner(Scanner scanner) {
        int phoneBookEntryCount = scanPhoneBookEntryCount(scanner);

        for (int i = 0; i < phoneBookEntryCount; i++) {
            scanNameAndNumberAddToPhoneBook(scanner);
        }
    }

    private static int scanPhoneBookEntryCount(Scanner scanner) {
        int phoneBookEntryCount = scanner.nextInt();
        scanner.nextLine();

        return phoneBookEntryCount;
    }

    private static void scanNameAndNumberAddToPhoneBook(Scanner scanner) {
        String name = scanner.nextLine();

        int phoneNumber = scanner.nextInt();
        scanner.nextLine();

        phoneBook.put(name, phoneNumber);
    }

    private static void buildNamesToSearchFromScanner(Scanner scanner) {
        while (scanner.hasNext()) {
            String nameToSearch = scanner.nextLine();
            namesToSearch.add(nameToSearch);
        }
    }

}
