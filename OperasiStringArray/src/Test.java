import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        List<Integer> numbers = new ArrayList<>();
//
//        // Menambahkan elemen ke dalam List
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//
//        // Mengakses dan mencetak elemen
//        for (Integer number : numbers) {
//            System.out.println(number);
//        }
        // kode berikut digunakan untuk menenukan perbedaan antara array,
        // tapi hanya pada index pertmana yang berbeda dimulai dari 0 dan berhenti disana saja
        int[] Array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] Array2 = {1, 2, 3, 4, 11, 6, 7, 8, 10};

        for (int i = 0; i <= Array1.length; i++) {
            if (Array1[i] == Array2[i]) {
                System.out.println(Arrays.mismatch(Array1, Array2));
            }
        }
    }
}
