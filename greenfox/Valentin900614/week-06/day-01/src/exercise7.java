import java.util.Arrays;
import java.util.List;

public class exercise7 {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
        String givenLetter = "A";

        cities.stream().filter(s -> s.startsWith(givenLetter)).forEach(System.out::println);
    }
}
