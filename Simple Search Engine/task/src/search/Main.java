package search;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String[] arr = first.split(" ");
        String output = "";
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            if (second.equals(arr[i])) {
                res = i + 1;
                output = String.valueOf(res);
                break;
            } else {
                output = "Not found";
            }
        }
        System.out.println(output);
    }
}
