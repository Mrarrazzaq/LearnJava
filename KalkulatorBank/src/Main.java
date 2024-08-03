import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nPilih operasi:");
            System.out.println("1. Hitung bunga sederhana");
            System.out.println("2. Hitung jumlah akhir dengan bunga sederhana");
            System.out.println("3. Hitung bunga majemuk");
            System.out.println("4. Hitung jumlah akhir dengan bunga majemuk");
            System.out.println("5. Hitung EMI pinjaman");
            System.out.println("6. Keluar");

            int choice = scanner.nextInt();

            if (choice == 6) {
                System.out.println("Terima kasih telah menggunakan aplikasi ini.");
                break;
            }

            System.out.print("Masukkan jumlah pokok: ");
            double principal = scanner.nextDouble();
            System.out.print("Masukkan suku bunga tahunan (%): ");
            double rate = scanner.nextDouble();
            System.out.print("Masukkan jangka waktu (tahun): ");
            int time = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Bunga sederhana: %.2f\n",
                            BankingCalculator.calculateSimpleInterest(principal, rate, time));
                    break;
                case 2:
                    System.out.printf("Jumlah akhir dengan bunga sederhana: %.2f\n",
                            BankingCalculator.calculateAmountWithSimpleInterest(principal, rate, time));
                    break;
                case 3:
                    System.out.print("Masukkan frekuensi pembungaan per tahun: ");
                    int n = scanner.nextInt();
                    System.out.printf("Bunga majemuk: %.2f\n",
                            BankingCalculator.calculateCompoundInterest(principal, rate, time, n));
                    break;
                case 4:
                    System.out.print("Masukkan frekuensi pembungaan per tahun: ");
                    n = scanner.nextInt();
                    System.out.printf("Jumlah akhir dengan bunga majemuk: %.2f\n",
                            BankingCalculator.calculateAmountWithCompoundInterest(principal, rate, time, n));
                    break;
                case 5:
                    System.out.printf("EMI bulanan: %.2f\n",
                            BankingCalculator.calculateEMI(principal, rate, time));
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close();

    }
}