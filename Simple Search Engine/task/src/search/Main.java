package search;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        String pathToFile = args[1];

        boolean repeatLoop = true;

        Scanner scanner = new Scanner(System.in);

        StringBuilder information = saveTheData(pathToFile);

        while (repeatLoop) {

                System.out.println();
                System.out.println("=== Menu ===\n" +
                        "1. Find a person\n" +
                        "2. Print all people\n" +
                        "0. Exit");

                int menu = scanner.nextInt();

                switch (menu) {
                    case 1:
                        System.out.println();
                        System.out.println("Enter a name or email to search all "
                                + "suitable people.");
                        findTheData(scanner, information);
                        break;
                    case 2:
                        System.out.println();
                        System.out.println("=== List of people ===");
                        System.out.println(information);
                        //
                        break;
                    case 0:
                        System.out.println("Bye!");
                        repeatLoop = false;
                        break;
                    default:
                        System.out.println("Incorrect option! Try again.");
                        break;
                }
            }
        }

    public static StringBuilder saveTheData(String pathToFile) {

        StringBuilder information = new StringBuilder();
        File file = new File(pathToFile);

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                information.append(sc.nextLine()).append("\n");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return information;
    }

//    public static Map<Integer, String> addDataToMap() {
//
//    }

    public static void findTheData(Scanner scanner,StringBuilder information) {

        scanner.nextLine(); // zero element
        String query = scanner.nextLine();

        String dataStr = information.toString();
        String[] data = dataStr.split("\n");

        List<String> results = new ArrayList<>();

        for (String value: data) {
            String[] searchQuery = query.split("");
            if (searchQuery.length == 1) {
                System.out.println("No matching people found.");
                break;
            } else if (value.toLowerCase().contains(query.strip().toLowerCase())) {
                results.add(value);
            }
        }

        // check List size
        if (results.size() == 0) {
            System.out.println("No matching people found.");
        } else {
            System.out.println(results.size() + " persons found:");
            for (String found: results) {
                System.out.println(found);
            }
        }
    }
}