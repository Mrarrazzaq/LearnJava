import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // Menambahkan elemen ke dalam List
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Mengakses dan mencetak elemen
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
