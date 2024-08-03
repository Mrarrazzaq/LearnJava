//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int jumlah = 0;
        for (int i = 1; i <= 5; i++){
            if(i%2 == 0){
                jumlah += i;
            }else{
                jumlah += 1;
            }
            System.out.println(jumlah);
        }
    }
}