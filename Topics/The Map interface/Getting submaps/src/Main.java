import java.util.Scanner;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);
        int from = scanner.nextInt();
        int to = scanner.nextInt();
        int total = scanner.nextInt();
        int count = 0;

        while (count != total) {
            int key = scanner.nextInt();
            String value = scanner.nextLine();

            map.put(key, value);
            count++;
        }
        map.subMap(from, true, to, true).forEach((k, v) -> System.out.println(k + "" + v));
    }
}