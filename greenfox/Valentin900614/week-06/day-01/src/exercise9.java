import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class exercise9 {
    public static void main(String[] args) {
        String string = "Ez egy példa mondat, amit meg fogok vizsgálni!";
        Map<String, Long> charMap;

        charMap = Arrays.stream(string.toLowerCase().replaceAll("[^a-zA-Z ]", "").split(""))
                .filter(s -> !s.equals(" "))
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        charMap.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
