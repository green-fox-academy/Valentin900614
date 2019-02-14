import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt

        Path path = Paths.get("reversed-order");
        List<String> list = new ArrayList<>();
        List<String> reversedList = new ArrayList<>();

        try {
            list = Files.readAllLines(path);

        } catch (Exception e) {
            System.err.println(e);
        }
        for (int i = list.size() - 1; i > 0; i--) {
            StringBuffer stringBuffer = new StringBuffer(list.get(i));
            reversedList.add(stringBuffer.toString());
        }

        for (String string : reversedList) {
            System.out.println(string);
        }
    }
}