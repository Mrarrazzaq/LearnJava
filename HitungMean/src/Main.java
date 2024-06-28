import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka (pisahkan dengan koma): ");
        String input = scanner.nextLine();

        String[] angkaString = input.split(",");
        int[] angka = new int[angkaString.length];

        for (int i = 0; i < angkaString.length; i++) {
            angka[i] = Integer.parseInt(angkaString[i].trim());
        }

        double mean = hitungMean(angka);

        System.out.printf("Mean: %.2f%n", mean);
        System.out.println("Mean setelah dibulatkan: " + Math.round(mean));

        scanner.close();
    }

    public static double hitungMean(int[] angka) {
        if (angka.length == 0) {
            throw new IllegalArgumentException("Array tidak boleh kosong");
        }

        long sum = 0;
        for (int num : angka) {
            sum += num;
        }
        return (double) sum / angka.length;
    }
}