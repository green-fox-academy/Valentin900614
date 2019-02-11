import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostCommonChar {
    public static void main(String[] args) {
        Path path = Paths.get("countchar.txt");
        try {
            List<String> list = Files.readAllLines(path);
            mostCommonElement(list);
        } catch (Exception e) {
            System.err.println("File does not exist!");
        }
    }

    private static void mostCommonElement(List<String> list) {

        Map<String, Integer> map = new HashMap<>();
        String subString = "";

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).length(); j++) {
                subString = list.get(i).substring(j, j + 1);
                if (!map.containsKey(subString)) {
                    map.put(subString, 1);
                } else
                    map.put(subString, map.get(subString) + 1);
            }
        }

        for (String name : map.keySet()) {
            String key = name;
            String value = map.get(name).toString();
            System.out.println(key + " " + value);
        }

        Map.Entry<String, Integer> firstEntry = map.entrySet().iterator().next();
        Integer largestKeyValue = firstEntry.getValue();
        String largestKey = firstEntry.getKey();

        for (Map.Entry<String, Integer> asd : map.entrySet()) {
            Integer key = asd.getValue();
            if (key > largestKeyValue) {
                largestKeyValue = key;
                largestKey = asd.getKey();
            }
        }
        System.out.println("Largest Key       : " + largestKey);
        System.out.println("Largest Key Value : " + largestKeyValue);

    }

}
