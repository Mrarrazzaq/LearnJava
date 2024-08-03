import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan angka: ");
        int angka = scan.nextInt();
        boolean prima = true;
        int i = 2;
        while (prima && i < angka) {
            if (angka % i == 0) {
                prima = false;
            }
            i++;
        }
        System.out.println(prima);
    }
}