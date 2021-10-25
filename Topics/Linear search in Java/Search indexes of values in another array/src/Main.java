import java.util.Arrays;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int bankAccounts = scanner.nextInt();
            int managers = scanner.nextInt();
            int countOfAcc = 0;
            int money = 0;
            int sum = 0;

//            int[] array = new int[bankAccounts];

            String allMoney = "";
            StringBuilder forMoney = new StringBuilder(allMoney);

            int countOfRes = 0;
            int sumOfCount = 0;

            int salary = 0;

            while(countOfAcc != bankAccounts) {
                money = scanner.nextInt();
                countOfAcc++;
                sum += money;

                forMoney.append((money) + ",");

                salary = sum / managers;

                countOfRes = (salary / 100);
                int a = Math.round(countOfRes);
                int c = money / countOfRes;
                sumOfCount += c;


            }
            System.out.println(forMoney);


            if (salary < 1) {
                System.out.println("000");
                return;
            } else {
//                int countOfRes = 0;
//                int sumOfCount = 0;
//                for (int i = 0; i < array.length; i++) {
//                    countOfRes = array[i] / 100;
//                    sumOfCount += countOfRes;
//                }
                System.out.println(sumOfCount);
            }
        }
    }

//
//public class Main {
//
//    public static int[] searchIndexes(int[] first, int[] second) {
//
//        int idx = 0;
//        int value = 0;
//
//        int[] result = new int[first.length];
//
//        for (int i = 0; i < first.length; i++) {
//            value = first[i];
//            for (int k = 0; k < second.length; k++) {
//                if (value == second[k]) {
//                    idx = k;
//                    break;
//                } else {
//                    idx = -1;
//                }
//            }
//            result[i] = idx;
//            idx = 0;
//        }
//        return result;
//
//    }
//
//    /* Do not change code below */
//    public static void main(String[] args) {
//        final Scanner scanner = new Scanner(System.in);
//        final int[] first = Arrays.stream(scanner.nextLine().split("\\s+"))
//                .mapToInt(Integer::parseInt)
//                .toArray();
//        final int[] second = Arrays.stream(scanner.nextLine().split("\\s+"))
//                .mapToInt(Integer::parseInt)
//                .toArray();
//        final String result = Arrays.toString(searchIndexes(first, second))
//                .replace(", ", " ")
//                .replace("[", "")
//                .replace("]", "");
//        System.out.println(result);
//    }
//}