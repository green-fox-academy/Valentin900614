import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DuplicatedChars {

    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt

        try {
            Path p = Paths.get("duplicated-chars.txt");
            List<String> listDouble = Files.readAllLines(p);

            StringBuilder stringBuilder = new StringBuilder();      //nem tanultuk még de ez a legjobb megoldás!
            for (int i = 0; i < listDouble.size(); i++) {
                for (int j = 0; j < listDouble.get(i).length(); j+=2) {
                    stringBuilder.append(listDouble.get(i).charAt(j));

                }
                stringBuilder.append("\n");
            }

            System.out.println(stringBuilder.toString());
            /*for (int i = 0; i < listDouble.size(); i++) {
                    String[] one = listDouble.get(i).split("  ");
                    String[] properString = new String[one.length/2];
                for (int j = 0; j < one.length; j++) {
                    if (j%2==0) {
                        properString[i] += one[j];

                    }
                }
                list.add(properString[i]);


            }
            System.out.println(list);*/
        } catch (Exception ex) {
            System.err.println("error");
        }

    }
}