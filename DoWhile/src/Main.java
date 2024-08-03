import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int z = scan.nextInt();
        int i = 1;
        do {
            System.out.println("Test, Baris ke" + i);
            i++;
        } while (i <= 50);
    }
}