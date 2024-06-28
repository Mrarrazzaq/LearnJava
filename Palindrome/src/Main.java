import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah kata: ");
        String kata = scanner.nextLine();

        if (cekpalindrom(kata)) {
            System.out.println(kata + " adalah palindrom.");
        } else {
            System.out.println(kata + " bukan palindrom.");
        }
    }

    public static boolean cekpalindrom(String kata) {
        String kebalikanya = "";
        for (int i = kata.length() - 1; i >= 0; i--) {
            kebalikanya += kata.charAt(i);
        }
        return kata.equalsIgnoreCase(kebalikanya);
    }
}
