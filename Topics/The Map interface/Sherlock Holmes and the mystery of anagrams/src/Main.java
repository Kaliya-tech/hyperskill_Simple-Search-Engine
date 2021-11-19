import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lineOne = scanner.nextLine();
        String lineTwo = scanner.nextLine();
        String[] firstLine = lineOne.toLowerCase(Locale.ROOT).split("");
        String[] secondLine = lineTwo.toLowerCase(Locale.ROOT).split("");

        Map<String, Integer> mapOne = new TreeMap<>();
        Map<String, Integer> mapTwo = new TreeMap<>();

        for (String keys : firstLine) {
            if (mapOne.containsKey(keys)) {
                mapOne.put(keys, mapOne.get(keys) + 1);
            } else {
                mapOne.put(keys, 1);
            }
        }

        for (String keys : secondLine) {
            if (mapTwo.containsKey(keys)) {
                mapTwo.put(keys, mapTwo.get(keys) + 1);
            } else {
                mapTwo.put(keys, 1);
            }
        }
        if (mapOne.equals(mapTwo)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}