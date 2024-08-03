import java.util.Scanner;

public class KataDenganHurufGanda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Masukkan kalimat:");
        String input = scanner.nextLine();

        // pisahkan kalimat menjadi kata-kata
        String[] kata = input.split("\\s+");

        // nampilin kata-kata yang memiliki huruf ganda
        System.out.println("Kata-kata yang memiliki huruf ganda:");
        for (String kataa : kata) {
            if (hasDuplicateLetters(kataa)) {
                System.out.println(kataa);
            }
        }

        scanner.close();
    }

    // cek sebuah kata ada huruf gandanya ga?
    private static boolean hasDuplicateLetters(String word) {

        // Array untuk menghitung frekuensi huruf (asumsi huruf kecil)
        int[] kemunculan = new int[26]; // maksudnya 26 huruf alfabet
        for (char ch : word.toCharArray()) {
            if (Character.isLetter(ch)) {
                int index = Character.toLowerCase(ch) - 'a'; // ubah huruf menjadi index 0-25
                kemunculan[index]++;
                if (kemunculan[index] > 1) {
                    return true; // Ada huruf yang berulang
                }
            }
        }
        return false; // gada huruf yang berulang
    }
}
