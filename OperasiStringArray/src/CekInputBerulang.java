import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class CekInputBerulang {
    public static void main(String[] args) {
        //Masukan nilai array
        // input {1,2,2,5,3,4,5,5}
        // output nilai berulang 2 dan 5
        int[] n = {3, 1, 2, 2, 5, 3, 4, 5, 4};
//        String x = "";
//        for (int i = 0; i < n.length - 1; i++) {
//            if (n[i] == n[i + 1]) {
//                x += n[i] + " ";
//            }
//        }
//        System.out.println(x.trim());
//        for (int i = n.length - 1; i>=0; i--){
//            System.out.println(n[i] + "");
//        }
//        Set<Integer> ganda = new HashSet<>();
//        for (int i = 0; i< n.length; i++){
//        if (!ganda.add(n[i])){
//                System.out.println("Nilai duplikat adalah: " + n[i]);
//            }
//            }
        //looping bagian luar untuk melakukan looping dari index ke 0 sampai index ke n
        for (int i = 0; i < n.length; i++) {

            //looping bagian dalam, dimulai dari hasil looping i+1 sampai index ke n
            for (int j = i + 1; j < n.length; j++) {
                //if statement, membandingkan nilai i (looping luar) dengan nilai j (looping dalam)
                // cara membangdingkanya adalah looping luar dimulai dari index ke 0 sedangkan looping dalam
                // dimulai dari index i+1 = ke 1, maka dapat dibandingkan kedua nilai dari looping tersebut
                if (n[i] == n[j]) {
                //jika nilai looping luar (i) sama dengan dalam (j) maka dianggap duplikat/berulang
                //kemudian ditulis pada output.
                    System.out.println("Nilai duplikat adalah: " + n[i]);
                    break;
                }
            }
        }

    }
}