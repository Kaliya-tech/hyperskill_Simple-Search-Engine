import java.util.*;

class MapUtils {

    public static SortedMap<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new TreeMap<>();


        for (String keys :strings) {

            if (map.containsKey(keys)) {
                map.put(keys, map.get(keys) + 1);
            } else {
                map.put(keys, 1);
            }
        }
        return (SortedMap<String, Integer>) map;
    }

    public static void printMap(Map<String, Integer> map) {

        for (String out : map.keySet()) {
            System.out.println(out + " : " + map.get(out));
        }
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