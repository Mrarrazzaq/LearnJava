import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan Jumlah Kata");
        int angka = scan.nextInt();
        scan.nextLine();
        System.out.println("Masukan kalimat");

        String kalimat = scan.nextLine();

        String[] kalimatarray = kalimat.split("\\s+");

        for (String kata : kalimatarray){
            if (kata.length() == angka){
                System.out.println(kata);
            }
        }
    }
}