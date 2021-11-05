import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String bN1 = scan.nextLine();
        String bN2 = scan.nextLine();

        String[] firstBox = bN1.split(" ");
        String[] secondBox = bN2.split(" ");

        int x1 = Integer.parseInt(firstBox[0]);
        int y1 = Integer.parseInt(firstBox[1]);
        int z1 = Integer.parseInt(firstBox[2]);

        int v1 = x1 + y1 + z1;

        int x2 = Integer.parseInt(secondBox[0]);
        int y2 = Integer.parseInt(secondBox[1]);
        int z2 = Integer.parseInt(secondBox[2]);

        int v2 = x2 + y2 + z2;

        if (v1 - v2 > 2) {
            System.out.println("Box 1 > Box 2");
        } else if (v2 - v1 > 2) {
            System.out.println("Box 1 < Box 2");
        } else {
            System.out.println("Incompatible");
        }

    }

}