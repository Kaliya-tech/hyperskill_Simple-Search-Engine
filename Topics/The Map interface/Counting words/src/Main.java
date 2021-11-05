import java.util.*;

class MapUtils {

    public static SortedMap<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new TreeMap<>();

        for (String keys :strings) {
            map.put(keys, 0);
        }
        return (SortedMap<String, Integer>) map;
    }

    public static void printMap(Map<String, Integer> map) {
        int count = 0;
        for (String key: map.keySet()) {
            if (map.containsKey(key)) {
                count++;
            }
        }
        System.out.println(count + " C");
    }

}

/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        MapUtils.printMap(MapUtils.wordCount(words));
    }
}