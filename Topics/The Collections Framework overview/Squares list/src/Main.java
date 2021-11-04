import java.util.*;
import java.util.stream.Collectors;

class CollectionUtils {

    public static Collection<Integer> pow2(Collection<Integer> numbers) {

        ArrayList<Integer> recordResults = new ArrayList<>();

        for (int powOfNum : numbers) {
            powOfNum = powOfNum * powOfNum;
            recordResults.add(powOfNum);

        }
        numbers.clear();
        numbers.addAll(recordResults);
        return numbers;
    }
}

/* Please, do not modify this I/O code */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Collection<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        Collection<Integer> result = CollectionUtils.pow2(numbers);

        System.out.println(result.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" ")));
        
    }
}