import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan Angka ");
        int angka = scan.nextInt();

        if (angka <= 1) {
            System.out.println(angka + " Bukan Bilangan Prima");
        } else {
            boolean BilPrima = true;
            for (int i = 2; i <= Math.sqrt(angka); i++) {
                if (angka % i == 0) {
                    BilPrima = false;
                    break;
                }
            }
            if (BilPrima) {
                System.out.println(angka + " Adalah Bilangan Prima");
            } else {
                System.out.println(angka + " Bukan Bilangan Prima");
            }
        }
    }
}
