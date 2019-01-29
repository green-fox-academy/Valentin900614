import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and
        // should not raise any error.

        System.out.println(countLines("asd.txt"));

    }

    public static int countLines(String filename) {
        int lines = 0;
        try {
            Path path = Paths.get(filename);
            List<String> list = Files.readAllLines(path);

            for (int i = 0; i < list.size(); i++) {
                lines++;
            }
        } catch (Exception ex) {
            return 0;       //lehet nem ez volt a feladat feltétele
        }
        return lines;
    }

}