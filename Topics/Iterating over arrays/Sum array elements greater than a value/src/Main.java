import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String c = scanner.nextLine();
        String arr = scanner.nextLine();
        String[] array = arr.split(" ");

        int n = scanner.nextInt();
        int res = 0;
        int output = 0;

        for (int i = 0; i < size; i++) {
            res = Integer.parseInt(array[i]);
            if (res > n) {
                output += res;
            }
        }
        System.out.println(output);


    }
}