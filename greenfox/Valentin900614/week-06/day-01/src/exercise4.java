import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class exercise4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        numbers = numbers.stream()
                .filter(s -> s % 2 == 1 || s % 2 == -1).collect(Collectors.toList());

        long numberOfAllOddNumbers = numbers.size();

        long sumOfAllOddNumbers = numbers.stream()
                .mapToInt(i -> i).sum();

        System.out.println(numberOfAllOddNumbers);
        System.out.println(sumOfAllOddNumbers);
        System.out.println((double)sumOfAllOddNumbers / (double)numberOfAllOddNumbers);

    }
}
