import java.util.Scanner;

public class TampilkanKataPertamaTerpanjang {
    //Tanpa Array
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();
        String[] kata = kalimat.split("\\s+");
        String kataTerpanjang = kata[0];
        for (String k : kata) {
            if (k.length() > kataTerpanjang.length()) {
                kataTerpanjang = k;
            }
        }
        System.out.println("Kata terpanjang: " + kataTerpanjang);
    }
}
