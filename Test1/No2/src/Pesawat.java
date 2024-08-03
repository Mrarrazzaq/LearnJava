public class Pesawat {
    private int kecepatan, panjang;
    public Pesawat(int kecepatan, int panjang){
        this.kecepatan = kecepatan;
        this.panjang = panjang;
    }
    public int jarak(int detik){
        return detik * this.kecepatan;
    }
    public void setKecepatan(int kecepatan){
        this.kecepatan = kecepatan;
    }
    public void panjang(){
        System.out.println(this.panjang);
    }
}
