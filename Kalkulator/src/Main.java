import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Pilih operasi: ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        Scanner scan = new Scanner(System.in);
        int pilihan = scan.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("Masukan Angka Pertama Dan Kedua");
                Penjumlahan penjumlahan = new Penjumlahan();
                System.out.println("Hasil Penjumlahan " + + penjumlahan.getAngka1() + " dan " + penjumlahan.getAngka2() + " Adalah " + penjumlahan.jumlahkan());
                break;
            case 2:
                System.out.println("Masukan Angka Pertama Dan Kedua");
                Pengurangan kurang = new Pengurangan();
                System.out.println("Hasil Pengurangan " + kurang.getAngka1() + " dan " + kurang.getAngka2() + " Adalah " + kurang.kurangi());
                break;
            case 3:
                System.out.println("Masukan Angka Pertama Dan Kedua");
                Perkalian kali = new Perkalian();
                System.out.println("Hasil Perkalian " + kali.getAngka1() + " dan " + kali.getAngka2() + " Adalah " + kali.kalikan());
                break;
            case 4:
                System.out.println("Masukan Angka Pertama Dan Kedua");
                Pembagian bagi = new Pembagian();
                System.out.println("Hasil Pembagian " + bagi.getAngka1() + " dan " + bagi.getAngka2() + " Adalah " + bagi.bagikan());
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}