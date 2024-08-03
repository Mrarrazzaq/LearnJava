import java.util.Arrays;
public class KataPErtamaTerpanjangArray {
    public static void main(String[] args) {
        String[] inputArray = {"pergi ke pasar", "pesan ojek online", "gulung tikar"};
        String result = ktPertamaTerpanjang(inputArray);
        System.out.println(result);
    }

    public static String ktPertamaTerpanjang(String[] inputdariArray) {
        String ktTerpanjang = "";

        for (String x : inputdariArray) {
            // Ambil kata pertama dari setiap string
            String ktPertama = x.split("\\s+")[0];

            // Bandingkan panjang kata dengan kata terpanjang saat ini
            if (ktPertama.length() > ktTerpanjang.length()) {
                ktTerpanjang = ktPertama;
            }
        }

        return ktTerpanjang;
    }
}
