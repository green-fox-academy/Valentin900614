import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class MostCommonChar {

    static int MAX_CHAR = 26;

    public static void main(String[] args) {
        most("countchar.txt");
    }

    public static void most (String file) {

        try {
            Path path = Paths.get(file);
            List<String> list = Files.readAllLines(path);

            String[] listArray = list.toArray(new String[0]);

            // primary array for common characters
            // we assume all characters are seen before.
            Boolean[] prim = new Boolean[MAX_CHAR];
            Arrays.fill(prim, new Boolean(true));

            // for each string
            for (int i = 0; i < listArray.length; i++) {

                // secondary array for common characters
                // Initially marked false
                Boolean[] sec = new Boolean[MAX_CHAR];
                Arrays.fill(sec, new Boolean(false));

                // for every character of ith string
                for (int j = 0; j < listArray[i].length(); j++)
                {

                    // if character is present in all
                    // strings before, mark it.
                    if (prim[listArray[i].charAt(j) - 'a'])
                        sec[listArray[i].charAt(j) - 'a'] = true;
                }

                // copy whole secondary array into primary
                System.arraycopy(sec, 0, prim, 0, MAX_CHAR);
            }

            // displaying common characters
            for (int i = 0; i < 26; i++)
                if (prim[i]){
                    System.out.print(Character.toChars(i
                            + 97));
                    System.out.print(" ");
                }

        } catch (Exception e) {
            System.err.println("File does not exist!");
        }


    }

}
