import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan Angka");

        int angka = scan.nextInt();
        for (int i = 1; i <= angka; i++) {
            if (angka % i == 0) {
                System.out.println(i + " ");
            }
        }


    }
}
