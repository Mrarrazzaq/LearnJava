public class Segitiga {
    int alas;
    int tinggi;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public int luas2(){
        int hasil = (this.alas * this.tinggi)/2;
        return hasil;
    }
    public double keliling2(){
        double sisimiring = Math.sqrt(Math.pow(this.alas, 2) + Math.pow(this.tinggi, 2));
        double hasil = this.alas + this.tinggi + sisimiring;
        return hasil;
    }
}
