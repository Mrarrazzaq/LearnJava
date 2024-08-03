import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firts = scan.nextLine();
        if (firts.charAt(0) == 'A'){
            System.out.println("A ");
            if (firts.charAt(1) == 'B'){
                System.out.println("B ");
            }
        } else if (firts.charAt(0) == 'B') {
            System.out.println("B ");
            if (firts.charAt(1) == 'C'){
                System.out.println("C ");
            }
        } else if (firts == "AB") {
            System.out.println("AB");
        } else {
            System.out.println("-");
        }
        scan.close();
    }
}