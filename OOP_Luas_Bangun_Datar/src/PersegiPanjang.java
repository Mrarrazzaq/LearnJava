public class PersegiPanjang {
    int panjang;
    int lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public int luas3(){
        int hasil = this.panjang * this.lebar;
        return hasil;
    }
    public int keliling3(){
        int hasil = 2 * (this.panjang + this.lebar);
        return hasil;
    }
}
