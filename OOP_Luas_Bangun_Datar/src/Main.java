//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Persegi persegiii = new Persegi(4);
        System.out.println("Luas Adalah " +persegiii.luas());
        System.out.println("Keliling Persegi Adalah " + persegiii.keliling());
        System.out.println("");

        Segitiga segiii = new Segitiga(3, 4);
        System.out.println("Luas Segitiga Adalah " + segiii.luas2());
        System.out.println("Keliling Segitiga Adalah " +segiii.keliling2());
        System.out.println("");

        PersegiPanjang panjanggg = new PersegiPanjang(7, 8);
        System.out.println("Luas Persegi Panjang Adalah " + panjanggg.luas3());
        System.out.println("Keliling Persegi Panjang Adalah " + panjanggg.keliling3());
        System.out.println("");
    }
}