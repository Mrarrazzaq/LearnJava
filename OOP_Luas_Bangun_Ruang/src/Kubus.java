public class Kubus {
    int sisi;

    public Kubus(int sisi) {
        this.sisi = sisi;
    }
    public int VolumeKubus(){
        int hasil = this.sisi * this.sisi * this.sisi;
        return hasil;
    }
}
