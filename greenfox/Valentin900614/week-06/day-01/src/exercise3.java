import java.util.Arrays;
import java.util.List;

public class exercise3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);

        numbers.stream()
                .filter(s -> s * s > 20)
                .forEach(System.out::println);
    }
}
