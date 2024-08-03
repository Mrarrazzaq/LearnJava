import java.util.Scanner;

public class CekHurufBerulang2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input dari pengguna
        System.out.println("Masukkan string:");
        String input = scanner.nextLine();

        // Array untuk menghitung frekuensi setiap huruf (asumsi huruf kecil dan besar diabaikan)
        int[] frequency = new int[256];  // 256 untuk semua karakter ASCII

        // Menghitung frekuensi setiap huruf
        for (char ch : input.toCharArray()) {
            frequency[ch]++;
        }

        // Menampilkan huruf-huruf yang berulang
        System.out.println("Huruf-huruf yang berulang:");
        int repeatingCharCount = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 1) {
                System.out.println((char) i + ": " + frequency[i]);
                repeatingCharCount++;
            }
        }

        System.out.println("Jumlah huruf yang berulang: " + repeatingCharCount);

        scanner.close();
    }
}
