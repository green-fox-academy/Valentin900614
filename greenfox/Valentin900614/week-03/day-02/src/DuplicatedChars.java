import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class DuplicatedChars {

    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt

        decrypt("duplicated-chars.txt");

    }

    public static void decrypt (String string) {
        try {
            Path p = Paths.get(string);
            List<String> listDouble = Files.readAllLines(p);

            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < listDouble.size(); i++) {
                for (int j = 0; j < listDouble.get(i).length(); j += 2) {
                    stringBuilder.append(listDouble.get(i).charAt(j));

                }
                stringBuilder.append("\n");
            }

            System.out.println(stringBuilder.toString());
        } catch (Exception ex) {
            System.err.println("error");
        }
    }

}