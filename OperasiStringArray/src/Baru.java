import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Baru {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 4, 2, 6, 8, 7, 9, 10};
        List<Integer> matchingNumbers = findMatchingPositions(numbers);
        System.out.println(matchingNumbers);
    }

    public static List<Integer> findMatchingPositions(int[] numbers) {
        List<Integer> matchingNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            // Indeks di sini adalah posisi berbasis 0, jadi i + 1 adalah posisi berbasis 1
            if (numbers[i] == i + 1) {
                matchingNumbers.add(numbers[i]);
            }
        }
        return matchingNumbers;
    }
}
