//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int side = 5;
        Square sq = new Square();
        sq.setSide(side);
        System.out.println(sq.getArea());
    }
}