import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukan Angka ");
        int angka = scan.nextInt();
        if (Prima(angka)) {
            System.out.println(angka + " Adalah bilangan prima");
        } else {
            System.out.println(angka + " Bukan bilangan prima");
        }
    }

    public static boolean Prima(int angka) {
        if (angka <= 1) {
            return false;
        } else {
            for (int i = 2; i <= angka / 2; i++) {
                if (angka % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
