import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();
        double h = scanner.nextDouble();
        double g = 9.8;

        System.out.println(d * h * g);
    }
}