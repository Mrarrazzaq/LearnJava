public class Pembagian extends Kalkulator {
    @Override
    public float getAngka1() {
        return super.getAngka1();
    }

    @Override
    public float getAngka2() {
        return super.getAngka2();
    }

    public float bagikan(){
        float hasil = getAngka1() / getAngka2();
        return hasil;
    }
}
