public class Balok {
    int panjang;
    int lebar;
    int tinggibalok;

    public Balok(int panjang, int lebar, int tinggibalok) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggibalok = tinggibalok;
    }
    public int VolumeBalok() {
        int hasil = this.panjang * this.lebar * this.tinggibalok;
        return hasil;
    }
}
