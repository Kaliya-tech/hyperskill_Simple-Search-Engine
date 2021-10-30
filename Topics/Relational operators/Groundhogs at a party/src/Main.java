import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        String[] input = inp.split(" ");

        int num = Integer.parseInt(input[0]);
        String isWeekend = input[1];

        if (isWeekend.equals("true")) {
            if (num <= 25 && num >= 15) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }

        } else {
            if (num <= 20 && num >= 10) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}