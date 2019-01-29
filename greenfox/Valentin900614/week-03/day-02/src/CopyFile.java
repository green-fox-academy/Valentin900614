import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        // Write a function that copies the contents of a file into another
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful

        System.out.println(copy("elso.txt", "masodik.txt"));

    }

    public static boolean copy (String fileName1, String fileName2) {
        try {
            Path path1 = Paths.get(fileName1);
            Path path2 = Paths.get(fileName2);

            List<String> list = Files.readAllLines(path2);

            Files.write(path1, list);
        } catch (Exception ex) {
            return false;
        }
        return true;
    }

}