import java.util.*;

public class CekNamaDuplikat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan Nama");
        String input = scan.nextLine();

        String nama[] = input.split(",\\s*");

        List<String> nameList = new ArrayList<>();
        Set<String> dupicateName = new HashSet<>();

        for (String namaa : nama){
            if (nameList.contains(namaa)){
                dupicateName.add(namaa);
            }
            else {
                nameList.add(namaa);
            }
        }
        System.out.println("Nama duplikat adalah ");
        for (String namaa: dupicateName){
            System.out.println(namaa);
        }
        scan.close();
    }
}
