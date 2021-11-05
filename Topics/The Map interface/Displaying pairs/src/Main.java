import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("Gamma",  3);
        map.put("Omega", 24);
        map.put("Alpha",  1);
        for (var out : map.entrySet()) {
            System.out.println(out.getKey() + "=" + out.getValue());
        }

        // write your code here    
    }
}