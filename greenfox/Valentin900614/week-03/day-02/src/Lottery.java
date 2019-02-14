import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Lottery {
    public static void main(String[] args) {
        // Create a method that find the 5 most common lottery numbers in lottery.csv

        Path path = Paths.get("lottery");
        List<String> lottery = new ArrayList<>();
        List<String> numbers = new ArrayList<>();

        try {
            lottery = Files.readAllLines(path);
        } catch (Exception e) {
            System.err.println(e);
        }

        int indexOfFt;
        for (String i : lottery) {
            indexOfFt = i.lastIndexOf("Ft;");
            String string = i.substring(indexOfFt + 3);
            string = string.replace(";", " ");
            numbers.add(string);
        }

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String key : numbers) {
            if (hashMap.containsKey(key)) {
                hashMap.put(key, hashMap.get(key) + 1);
            } else
                hashMap.put(key, 1);
        }

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
