public class Tabung {
    int radius;
    int tinggi;

    public Tabung(int radius, int tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }
    public double VolumeTabung(){
        double volume = Math.PI * Math.pow(radius, 2) * tinggi;
        int pembulatan = (int) Math.round(volume);
        return pembulatan;
    }
}
