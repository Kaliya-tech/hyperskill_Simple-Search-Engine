import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] first = scanner.nextLine().toLowerCase().split("");
        String[] second = scanner.nextLine().toLowerCase().split("");

        ArrayList<String> one = new ArrayList<>(Arrays.asList(first));
        ArrayList<String> two = new ArrayList<>(Arrays.asList(second));

        int count = 0;

        for (String letter : one) {
            if (two.remove(letter)) {
                count++;
            }
        }
        System.out.println(first.length + second.length - 2 * count);

    }
}