import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class exercise10 {
    public static void main(String[] args) {
        List<Fox> foxes = Arrays.asList(
                new Fox("Vuk", "red", 3),
                new Fox("GreenFox", "green", 5),
                new Fox("Karak", "red", 8),
                new Fox("Ravasz", "green", 4),
                new Fox("Asd", "grey", 5)
        );

        foxes.stream()
                .filter(s -> s.getColor().equals("green"))
                .forEach(s -> System.out.println(s.getName()));
        System.out.println();

        foxes.stream()
                .filter(s -> s.getColor().equals("green"))
                .filter(s -> s.getAge() < 5)
                .forEach(s -> System.out.println(s.getName()));
        System.out.println();

        Map<String, List<Fox>> foxMap = foxes.stream()
                .collect(Collectors.groupingBy(s -> s.getColor()));
        System.out.println(foxMap);
    }
}
