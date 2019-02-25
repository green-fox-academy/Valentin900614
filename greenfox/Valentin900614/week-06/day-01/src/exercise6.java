import java.util.stream.Stream;

public class exercise6 {
    public static void main(String[] args) {
        String string = "KiCsIt fUrCsÁn íRtAm lE EzT.";

        Stream<Character> characterStream = string.chars()
                .mapToObj(c -> (char) c);

        characterStream.filter(s -> (Character.isUpperCase(s)))
                .forEach(System.out::print);

    }
}
