import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args) {

        String source = "C:\\Users\\mrarr\\Downloads\\Folder1\\text.txt";
        String destination = "C:\\Users\\mrarr\\Downloads\\Folder2\\text.txt";
        try {
            Files.move(Paths.get(source), Paths.get(destination), StandardCopyOption.REPLACE_EXISTING);
            //Untuk copy ganti 'move' jadi 'copy'
        } catch (IOException e) {
            e.printStackTrace();}
        }
    }
