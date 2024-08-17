
public class Palindrome {
    public static void main(String[] args) {
        String kata = "katak";
        String balik = "";
        for (int i = kata.length() - 1; i >= 0; i--) {
            balik += kata.charAt(i);
        }
        System.out.println(kata + " == " + balik);
        System.out.println(kata + " Adalah Palindrome");
    }
}
