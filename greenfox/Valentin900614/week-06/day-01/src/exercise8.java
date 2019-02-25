import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class exercise8 {
    public static void main(String[] args) {
        List<Character> list = Arrays.asList('E', 'z', ' ', 'e', 'g', 'y', ' ', 'm', 'o', 'n', 'd', 'a', 't', '.');

        String string = list.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(string);
    }
}
