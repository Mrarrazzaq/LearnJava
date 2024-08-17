import java.util.Arrays;
import java.util.*;

public class ComparePosisiArray {
    public static void main(String[] args) {
        int[] Array1 = {1, 3, 5, 4, 2, 6, 8, 7, 9, 10};
        int[] Array2 = Arrays.copyOf(Array1, Array1.length);
        Arrays.sort(Array2);

        for (int i = 0; i < Array1.length; i++) {
            if (Array1[i] == Array2[i]) {
                System.out.println("Index: " + i + ", Nilai Array dengan posisi yang benar: " + Array1[i]);
            }
        }
    }
}
