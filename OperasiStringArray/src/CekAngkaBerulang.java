import java.util.HashSet;
import java.util.Set;

public class CekAngkaBerulang {
    public static void main(String[] args) {
//        int[] angka = {1, 2, 1, 2, 2, 3, 4, 5, 5};
//        Set<Integer> seen = new HashSet<>();
//        Set<Integer> duplicates = new HashSet<>();
//
//        for (int num : angka) {
//            if (!seen.add(num)) {
//                duplicates.add(num);
//            }
//        }
//
//        System.out.println("Angka yang berulang: " + duplicates);

        // An array storing different ages
//        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
//
//        float avg, sum = 0;
//
//// Get the length of the array
//        int length = ages.length;
//
//// Loop through the elements of the array
//        for (int age : ages) {
//            sum = sum + age;
//
//        }
//
//// Calculate the average by dividing the sum by the length
//        avg = sum / length;
//
//// Print the average
//        System.out.println("The average age is: " + avg);

//        int[] angka = {1, 2, 1, 2, 2, 3, 4, 5, 5};
//        boolean[] seen = new boolean[10]; // Asumsi angka 0-9
//        System.out.print("Angka yang berulang: ");
//
//        for (int num : angka) {
//            if (seen[num]) {
//                System.out.print(num + " ");
//            } else {
//                seen[num] = true;
//            }
//        }

//        public class CekAngkaBerulang {
//            public static void main(String[] args) {
//                int[] angka = {1, 2, 1, 2, 2, 3, 4, 5, 5};
//                int[] count = new int[10]; // Asumsi angka 0-9
//
//                for (int num : angka) {
//                    count[num]++;
//                }
//
//                System.out.print("Angka yang berulang: ");
//                for (int i = 0; i < count.length; i++) {
//                    if (count[i] > 1) {
//                        System.out.print(i + " ");
//                    }
//                }
//            }
//        }

        int[] angka = {1, 2, 1, 2, 2, 3, 4, 5, 5};
        int[] count = new int[10]; // Asumsi angka 0-9

        for (int num : angka) {
            count[num]++;
        }

        System.out.print("Angka yang berulang: ");
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1) {
                System.out.print(i + " ");
            }
        }

    }
}