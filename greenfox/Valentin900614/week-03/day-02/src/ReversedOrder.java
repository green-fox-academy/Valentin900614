import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt

        Path path = Paths.get("reversed-order");

        try {
            List<String> list = Files.readAllLines(path);
            List<String> reversedList = new ArrayList<>();

            for (int i = list.size() - 1; i > 0; i--) {
                StringBuffer stringBuffer = new StringBuffer(list.get(i));
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