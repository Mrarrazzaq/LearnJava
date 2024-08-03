import java.util.Scanner;

public class StringIndex {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan angka");
        int i = scan.nextInt();
        scan.nextLine();
        String n = scan.nextLine();

        String [] kata = n.split("\\s+");

        for (String x : kata){
            if (x.length() == i){
                System.out.println(x);
            }
        }
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int a = 0; a < cars.length; a++) {
            System.out.println(cars[a]);
        }
    }
}
