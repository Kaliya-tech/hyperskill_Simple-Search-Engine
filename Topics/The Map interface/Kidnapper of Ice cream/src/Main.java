import java.util.Scanner;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) {

        TreeMap<Integer, String> wordsMap = new TreeMap<>();
        TreeMap<Integer, String> noteMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);

        String[] availableWords = scanner.nextLine().split(" ");
        String[] note = scanner.nextLine().split(" ");

        if (availableWords.length < note.length) {
            System.out.println("You are busted");
            return;
        }

        int count = 0;
        int keys = 1;
        String out = "";

        for (int i = 0; i < availableWords.length; i++) {
            String valueW = availableWords[i];
            wordsMap.put(i + 1, valueW);
        }

        for (int k = 0; k < note.length; k++) {
            String valueN = note[k];
            noteMap.put(k + 1, valueN);


            for (var entry : wordsMap.entrySet()) {
                if (entry.getValue().equals(noteMap.get(keys))) {
                    count++;
                 //   System.out.println(entry.getValue() + " == " + entry.getValue());
                }
            }
            if (count == noteMap.size()) {
                out = "You get money";
            } else if (wordsMap.size() < noteMap.size()) {
                out = "You are busted";
            } else {
                out = "You are busted";
            }
        }
//      System.out.println(wordsMap);
//      System.out.println(noteMap);
        System.out.println(out);
    }
}