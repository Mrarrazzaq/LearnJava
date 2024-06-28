import java.util.Scanner;

public class Kalkulator {
    Scanner scan = new Scanner(System.in);
    float angka1 = scan.nextFloat();
    float angka2 = scan.nextFloat();

    public float getAngka1() {
        return angka1;
    }

    public void setAngka1(float angka1) {
        this.angka1 = angka1;
    }

    public float getAngka2() {
        return angka2;
    }

    public void setAngka2(float angka2) {
        this.angka2 = angka2;
    }
}
