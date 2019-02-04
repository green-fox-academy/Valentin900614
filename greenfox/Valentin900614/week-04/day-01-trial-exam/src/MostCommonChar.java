import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class MostCommonChar {
    public static void main(String[] args) {

    }

    public static void most (File file) {

        try {
            Path path = Paths.get("file");
            List<String> list = Files.readAllLines(path);

            for (int i = 0; i < list.size(); i++) {

            }
        } catch (Exception e) {
            System.err.println("File does not exist!");
        }


    }

}
