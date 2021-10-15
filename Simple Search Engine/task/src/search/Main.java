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
                another.append((allInformation) + "/");
            }
        }
        countQueries(scanner, another);
    }

    public static void countQueries(Scanner scanner, StringBuilder another) {

        System.out.println("Enter the number of search queries:");
        String numberOfSearch = scanner.nextLine();
        int numberOfS = Integer.parseInt(numberOfSearch);
        int countOfQueries = 0;

        if (numberOfSearch.equals("1")) {
            findTheData(another, scanner);
        } else {
            while (countOfQueries != numberOfS) {
                findTheData(another, scanner);
                countOfQueries++;
            }
        }
    }

    public static void findTheData(StringBuilder another, Scanner scanner) {

        System.out.println("Enter data to search people:");
        String data = scanner.nextLine();

        String allSuggestions = another.toString();
        String[] suggestions = allSuggestions.split("/");
        List<String> results = new ArrayList<>();

        for (int i = 0; i < suggestions.length; i++) {
            if (suggestions[i].toLowerCase().contains(data.toLowerCase())) {
                results.add(suggestions[i]);
            }
        }

        if (results.size() > 0) {
            System.out.println("Found people:");
            for (String output: results) {
                System.out.println(output);
            }
        } else {
            System.out.println("No matching people found.");
        }
    }
}