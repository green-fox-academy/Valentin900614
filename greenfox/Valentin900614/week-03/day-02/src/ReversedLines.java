import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt

        Path path = Paths.get("reversed-lines");

        try {
            List<String> list = Files.readAllLines(path);
            List<String> reversedList = new ArrayList<>();

            for (int i = 0; i < list.size(); i++) {
                StringBuffer stringBuffer = new StringBuffer(list.get(i));
                stringBuffer.reverse();
                reversedList.add(stringBuffer.toString());
            }

            for (int i = 0; i < reversedList.size(); i++) {
                System.out.println(reversedList.get(i));
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
