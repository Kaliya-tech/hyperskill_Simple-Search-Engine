import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] searchIndexes(int[] first, int[] second) {

        int idx = 0;
        int value = 0;

        int[] result = new int[first.length];

        for (int i = 0; i < first.length; i++) {
            value = first[i];
            for (int k = 0; k < second.length; k++) {
                if (value == second[k]) {
                    idx = k;
                    break;
                } else {
                    idx = -1;
                }
            }
            result[i] = idx;
            idx = 0;
        }
        return result;

    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int[] first = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        final int[] second = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        final String result = Arrays.toString(searchIndexes(first, second))
                .replace(", ", " ")
                .replace("[", "")
                .replace("]", "");
        System.out.println(result);
    }
}