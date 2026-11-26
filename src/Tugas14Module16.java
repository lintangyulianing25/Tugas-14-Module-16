import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class Tugas14Module16 {

    static boolean anagram(String kata1, String kata2) {
        kata1 = kata1.toLowerCase();
        kata2 = kata2.toLowerCase();

        char[] huruf1 = kata1.toCharArray();
        char[] huruf2 = kata2.toCharArray();

        Arrays.sort(huruf1);
        Arrays.sort(huruf2);

        return Arrays.equals(huruf1, huruf2);
    }

    static void main(String[] args) {

        Tugas14Module16 gram = new Tugas14Module16();

        String kata = "CAT";

        System.out.println("CAT dan ACT : " + gram.anagram(kata, "ACT"));
        System.out.println("CAT dan tac : " + gram.anagram(kata, "tac"));
        System.out.println("CAT dan TCA : " + gram.anagram(kata, "TCA"));
        System.out.println("CAT dan aTC : " + gram.anagram(kata, "aTC"));
        System.out.println("CAT dan CtA : " + gram.anagram(kata, "CtA"));
 
    }
}
