import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int count = 0;

        int[] numbers = new int[size];


        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
//            if (numbers[i+1] - numbers[i] == 1 && numbers[i+2] - numbers[i+1] == 1) {
//                count++;
//            }
        }
        System.out.println(Arrays.toString(numbers));

    }
}