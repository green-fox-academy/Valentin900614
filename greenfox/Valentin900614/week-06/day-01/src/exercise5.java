import java.util.Arrays;
import java.util.List;

public class exercise5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);

        long sumOfOddNumbers = numbers.stream()
                .filter(s -> s % 2 == 1)
                .mapToInt(s -> s)
                .sum();

        System.out.println(sumOfOddNumbers);
    }
}
