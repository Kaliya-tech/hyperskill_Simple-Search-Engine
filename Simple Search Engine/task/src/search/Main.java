package search;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        startSearch(scanner);
    }

    public static void startSearch(Scanner scanner) {
        System.out.println("Enter the number of people:");
        String number = scanner.nextLine();
        int numberOfPeople = Integer.parseInt(number);

        System.out.println("Enter all people:");

        String allInformation = "";
        String inf = "";
        StringBuilder another = new StringBuilder(inf);

        int count = 0;
        if (number.equals("1")) {
            allInformation = scanner.nextLine();
        } else {
            while (count != numberOfPeople) {
                allInformation = scanner.nextLine();
                count++;
                another.append((allInformation) + "\n");
            }
        }
        showMenu(scanner, another);
    }

    public static void showMenu(Scanner scanner, StringBuilder another) {

        System.out.println();
        System.out.println("=== Menu ===\n" +
                "1. Find a person\n" +
                "2. Print all people\n" +
                "0. Exit");

        int menu = scanner.nextInt();

        switch (menu) {
            case 1:
                System.out.println();
                System.out.println("Enter a name or email to search all suitable people.");
                findTheData(scanner, another);
                showMenu(scanner, another);
                break;
            case 2:
                System.out.println();
                System.out.println("=== List of people ===");
                System.out.println(another);
                showMenu(scanner, another);
                break;
            case 0:
                System.out.println();
                System.out.println("Bye!");
                return;
            default:
                System.out.println();
                System.out.println("Incorrect option! Try again.");
                showMenu(scanner, another);
                break;
        }
    }

    public static void countQueries(Scanner scanner, StringBuilder another) {

        System.out.println("Enter the number of search queries:");
        String numberOfSearch = scanner.nextLine();
        int numberOfS = Integer.parseInt(numberOfSearch);
        int countOfQueries = 0;

        if (numberOfSearch.equals("1")) {
            findTheData(scanner, another);
        } else {
            while (countOfQueries != numberOfS) {
                findTheData(scanner, another);
                countOfQueries++;
            }
        }
    }

    public static void findTheData(Scanner scanner, StringBuilder another) {

        String data0 = scanner.nextLine();
        String data = scanner.nextLine();

        String allSuggestions = another.toString();
        String[] suggestions = allSuggestions.split("\n");
        List<String> results = new ArrayList<>();

        for (int i = 0; i < suggestions.length; i++) {
            if (suggestions[i].toLowerCase().contains(data.toLowerCase())) {
                results.add(suggestions[i]);
            }
        }

        if (results.size() > 0) {
            for (String output: results) {
                System.out.println(output);
            }
        } else {
            System.out.println("No matching people found.");
        }
    }
}