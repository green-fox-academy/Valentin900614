import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class MostCommonChar {

 /*   public static void main(String[] args) {
        most("countchar.txt");
    }

    public static char most (String file) {

        try {
            Path path = Paths.get(file);
            List<String> list = Files.readAllLines(path);

            int characterCount = 0;
            int maxCharacter = 0;
            char maxCharacterChar = '.';

            char[] cArray = new char[list.size()];

            for (int i = 0; i < cArray.length; i++) {
                String a = list.get(i);
                for (int j = 0; j < a.length(); j++) {
                    String sub = a.substring(j, j);
                    cArray = sub.toCharArray();
                }
            }

       //     String[] listArray = list.toArray(new String[0]);



         //   char[] cArray = list.toCharArray();

            for(int i =0; i < cArray.length; i++)
            {
                int characterASCII = (int)cArray[i];
                characterCount = 0;

                //System.out.print("Chracter ASCII: " + characterASCII + "\n");
                for(int x = 0; x < cArray.length; x++)
                {
                    if(characterASCII == (int)cArray[x])
                    {
                        characterCount ++;
                        //System.out.print("Character Count for " + characterASCII + " " +  characterCount  + "\n");
                        if(characterCount > maxCharacter)
                        {
                            maxCharacter = characterCount;
                            maxCharacterChar = cArray[i];
                        }
                    }
                }
            }

        } catch (Exception e) {
            System.err.println("File does not exist!");
        }

        return maxCharacterChar;

    }*/

}
