package search;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        String pathToFile = args[1];
        File file = new File(pathToFile);

        String inf = "";
        StringBuilder information = new StringBuilder(inf);

        Scanner scanner = new Scanner(System.in);

        try (Scanner sc = new Scanner(file)){

            startSearch(scanner, sc, information, inf);
        } catch (FileSystemException exception) {
                System.out.println(exception.getMessage());
        } finally {
                file.delete();
        }
    }

    public static void startSearch(Scanner scanner, Scanner sc,
                                   StringBuilder information, String inf) throws IOException {

        System.out.println();
        System.out.println("=== Menu ===\n" +
                "1. Find a person\n" +
                "2. Print all people\n" +
                "0. Exit");

        String str = scanner.nextLine();
        int menu = Integer.parseInt(str);

            switch (menu) {
                case 1:
                    System.out.println();
                    System.out.println("Enter a name or email to search all "
                            + "szuitable people.");
                    findTheData(scanner, sc, information);
                    startSearch(scanner, sc, information, inf);
                    break;
                case 2:
                    System.out.println();
                    System.out.println("=== List of people ===");

                    while (sc.hasNext()) {
                        inf = sc.nextLine();
                        information.append(inf).append("\n");
                    }
                    System.out.println(information);
                    startSearch(scanner, sc, information, inf);
                    break;
                case 0:
                    System.out.println();
                    System.out.println("Bye!");
                    return;

                default:
                    System.out.println();
                    System.out.println("Incorrect option! Try again.");
                    startSearch(scanner, sc, information, inf);
                    break;
            }
    }

    public static void saveTheData(Scanner sc, StringBuilder information, String inf) {

        while (sc.hasNext()) {
            inf = sc.nextLine();
            information.append(inf);
        }
        sc.close();
        System.out.println(information);
    }

    public static void findTheData(Scanner scanner, Scanner sc, StringBuilder information)
            throws IOException {

        String data = scanner.nextLine();
        String changedData = data.trim();

        String allSuggestions = information.toString();
        String[] suggestions = allSuggestions.split("\n");

        List<String> results = new ArrayList<>();

        for (int i = 0; i < suggestions.length; i++) {
            if (suggestions[i].toLowerCase().contains(changedData.toLowerCase())) {
                results.add(suggestions[i]);
            }
        }

        // check List size
        if (results.size() > 0) {
            for (String output: results) {
                System.out.println(output);
            }
        } else {
            System.out.println("No matching people found.");
        }
    }
}