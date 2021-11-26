package search;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String pathToFile = args[1];

        ArrayList<String> information = saveTheData(pathToFile);
        Map <String, List<Integer>> invertedMap = new HashMap<>();

        invertedIndex(information, invertedMap);

        boolean repeatLoop = true;
        while (repeatLoop) {

                System.out.println();
                System.out.println("\n" + "=== Menu ===\n" +
                        "1. Find a person\n" +
                        "2. Print all people\n" +
                        "0. Exit");

                int menu = scanner.nextInt();

                switch (menu) {
                    case 1:
                        pickTheStrategy(scanner, information);
                        break;
                    case 2:
                        System.out.println("\n" + "=== List of people ===");
                        information.stream().forEach(System.out::println);
                        break;
                    case 0:
                        System.out.println("\n" + "Bye!");
                        repeatLoop = false;
                        break;
                    default:
                        System.out.println("\n" + "Incorrect option! Try again.");
                        break;
                }
            }
        }

    public static ArrayList saveTheData(String pathToFile) {

        ArrayList<String> information = new ArrayList<>();
        File file = new File(pathToFile);

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                String data = sc.nextLine();
                information.add(data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return information;
    }

    public static void pickTheStrategy(Scanner scanner,ArrayList<String> information) {

        System.out.println("\n" + "Select a matching strategy: ALL, ANY, NONE");

        scanner.nextLine(); // zero element
        String strategy = scanner.nextLine();

        System.out.println("\n" + "Enter a name or email to search all "
                + "suitable people.");

        switch (strategy) {
            case "ALL":
                allStrategy(scanner, information);
                break;
            case "ANY":
                anyStrategy(scanner, information);
                break;
            case "NONE":
                noneStrategy(scanner, information);
                break;
        }
    }

    public static void allStrategy(Scanner scanner, ArrayList<String> information) {

        String query = scanner.nextLine().trim().toLowerCase(Locale.ROOT);
        String[] queryArr = query.split("");
        List<String> output = new ArrayList<>();

        int size = queryArr.length;

        switch (size) {
            case 1:
                for (String inf : information) {
                    if (inf.toLowerCase().contains(queryArr[0])) {
                        output.add(inf);
                    }
                }
                break;
            case 2:
                for (String inf : information) {
                    if (inf.toLowerCase().contains(queryArr[0])
                            && inf.toLowerCase().contains(queryArr[1])) {
                        output.add(inf);
                    }
                }
                break;
            case 3:
                for (String inf : information) {
                    if (inf.toLowerCase().contains(queryArr[0])
                            && inf.toLowerCase().contains(queryArr[1])
                            && inf.toLowerCase().contains(queryArr[2])) {
                        output.add(inf);
                    }
                }
        }

        //CHECK LIST SIZE
        if (output.size() == 0) {
            System.out.println("\n" + "No matching people found.");
        } else {
            System.out.println("\n" + output.size() + " persons found:");
            output.stream().forEach(System.out::println);
        }
    }

    public static void anyStrategy(Scanner scanner, ArrayList<String> information) {

        String query = scanner.nextLine().trim().toLowerCase(Locale.ROOT);
        String[] queryArr = query.split(" ");
        List<String> output = new ArrayList<>();

        int size = queryArr.length;

        switch (size) {
            case 1:
                for (String inf : information) {
                    if (inf.toLowerCase().contains(queryArr[0])) {
                        output.add(inf);
                    }
                }
                break;
            case 2:
                for (String inf : information) {
                    if (inf.toLowerCase().contains(queryArr[0])
                            || inf.toLowerCase().contains(queryArr[1])) {
                        output.add(inf);
                    }
                }
                break;
            case 3:
                for (String inf : information) {
                    if (inf.toLowerCase().contains(queryArr[0])
                            || inf.toLowerCase().contains(queryArr[1])
                            || inf.toLowerCase().contains(queryArr[2])) {
                        output.add(inf);
                    }
                }
        }

        //CHECK LIST SIZE
        if (output.size() == 0) {
            System.out.println("\n" + "No matching people found.");

        } else {
            System.out.println("\n" + output.size() + " persons found:");
            output.stream().forEach(System.out::println);
        }
    }

    public static void noneStrategy(Scanner scanner, ArrayList<String> information) {

        String query = scanner.nextLine().trim().toLowerCase(Locale.ROOT);
        String[] queryArr = query.split(" ");
        List<String> output = new ArrayList<>();

        int size = queryArr.length;

        switch (size) {
            case 1:
                for (String inf : information) {
                    if (!inf.toLowerCase().contains(queryArr[0])) {
                        output.add(inf);
                    }
                }
                break;
            case 2:
                for (String inf : information) {
                    if (!inf.toLowerCase().contains(queryArr[0])
                            && !inf.toLowerCase().contains(queryArr[1])) {
                        output.add(inf);
                    }
                }
                break;
            case 3:
                for (String inf : information) {
                    if (!inf.toLowerCase().contains(queryArr[0])
                            && !inf.toLowerCase().contains(queryArr[1])
                            && !inf.toLowerCase().contains(queryArr[2])) {
                        output.add(inf);
                    }
                }
        }

        //CHECK LIST SIZE
        if (output.size() == 0) {
            System.out.println("\n" + "No matching people found.");

        } else {
            System.out.println("\n" + output.size() + " persons found:");
            output.stream().forEach(System.out::println);
        }
    }

    public static void invertedIndex(ArrayList<String> information, Map <String, List<Integer>> invertedMap) {

        for (int i = 0; i < information.size(); i++) {
            String[] words = information.toString().trim().toLowerCase().split(" ");
            for (String word : words) {
                if (!invertedMap.containsKey(word)) {
                    invertedMap.put(word, new ArrayList<>());
                }
                invertedMap.get(word).add(i);
            }
        }
    }
}