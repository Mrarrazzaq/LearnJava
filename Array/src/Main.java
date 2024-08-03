//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // Mengakses elemen array menggunakan for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + " is: " + numbers[i]);
        }

        // Mengakses elemen array menggunakan enhanced for loop
        for (int number : numbers) {
            System.out.println("Number is: " + number);
        }
    }
}