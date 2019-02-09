import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Lottery {
    public static void main(String[] args) {
        // Create a method that find the 5 most common lottery numbers in lottery.csv

        Path path = Paths.get("lottery");

        try {
            List<String> lottery = Files.readAllLines(path);
            List<String> numbers = new ArrayList<>();

            int indexOfFt = 0;
            for (int i = 0; i < lottery.size(); i++) {
                indexOfFt = lottery.get(i).lastIndexOf("Ft;");
                String string = lottery.get(i).substring(indexOfFt + 3);
                string = string.replace(";", " ");
                numbers.add(string);
            }

            HashMap<String, Integer> hashMap = new HashMap<>();

            for (int i = 0; i < numbers.size(); i++) {
                int counter = 0;
                for (int j = 1; j < numbers.size() - i; j++) {
                    if (numbers.get(i) == numbers.get(j))
                        counter++;
                }
                hashMap.put(numbers.get(i), counter);
            }



            for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }

        } catch (Exception e) {
            System.err.println(e);
        }

    }
}
