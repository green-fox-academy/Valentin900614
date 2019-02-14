import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt

        Path path = Paths.get("reversed-lines");
        List<String> list = new ArrayList<>();
        List<String> reversedList = new ArrayList<>();

        try {
            list = Files.readAllLines(path);

        } catch (Exception e) {
            System.err.println(e);
        }

        for (String string : list) {
            StringBuffer stringBuffer = new StringBuffer(string);
            stringBuffer.reverse();
            reversedList.add(stringBuffer.toString());
        }

        for (String string : reversedList) {
            System.out.println(string);
        }
    }
}
