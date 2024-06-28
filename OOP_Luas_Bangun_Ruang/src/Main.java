import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Kubus Series
        System.out.println("Masukan Panjang Sisi ");
        int sisi = scan.nextInt();
        Kubus kubusss = new Kubus(sisi);
        System.out.println("Volume Kubus Adalah " + kubusss.VolumeKubus());
        System.out.println("");

        // Balok Series
        System.out.println("Masukan Panjang Balok ");
        int panjangbalok = scan.nextInt();
        System.out.println("Masukan Lebar Balok ");
        int lebarbalok = scan.nextInt();
        System.out.println("Masukan Tinggi Balok ");
        int tinggibalok = scan.nextInt();
        Balok baloks = new Balok(panjangbalok, lebarbalok, tinggibalok);
        System.out.println("Volume Balok Adalah " + baloks.VolumeBalok());

        // Tabung Series
        System.out.println("Masukan Radius Tabung ");
        int radiustabung = scan.nextInt();
        System.out.println("Masukan Tinggi Tabung ");
        int tinggitabung = scan.nextInt();
        Tabung tabunggg = new Tabung(radiustabung, tinggitabung);
        System.out.println("Volume Tabung Adalah " + tabunggg.VolumeTabung());

    }
}