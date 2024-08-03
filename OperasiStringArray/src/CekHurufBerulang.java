import java.util.Scanner;

public class CekHurufBerulang {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan sebuah kata: ");
        String input = scan.nextLine();

        for (int i = 0; i < input.length(); i++) {
            if (input.indexOf(input.charAt(i)) != input.lastIndexOf(input.charAt(i))) {
                System.out.println("Huruf berulang");
                break;
            } else {
                System.out.println("Huruf tidak berulang");
            }
        }
    }
}
