import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int firstCheck = 0;
        List<Integer> arr = new ArrayList<>();

        while (scanner.hasNext()) {
            num = scanner.nextInt();
            if (num % 4 == 0) {
                firstCheck = num;
                arr.add(firstCheck);
            }
        }
        int out = 0;
        System.out.println(arr);
        for (int secondCheck : arr) {
            if (secondCheck > 4) {
                out = secondCheck;
            } else if (out > secondCheck) {
                System.out.println(out + " s");
            }
        }

    }
}