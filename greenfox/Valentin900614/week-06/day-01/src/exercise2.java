import java.util.Arrays;
import java.util.List;

public class exercise2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        numbers.stream()
                .filter(s -> s > 0)
                .forEach(s -> System.out.println(s * s));
    }
}
