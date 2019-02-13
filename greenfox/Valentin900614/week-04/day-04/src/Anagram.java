import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println("Chill, I try to do my best!");
    }

    public boolean anagram (String x, String y) {

        x  = x.replaceAll("\\s", "").toLowerCase();
        y = y.replaceAll("\\s", "").toLowerCase();

        /* check whether string lengths are equal or not,
        if unequal then not anagram */
        if (x.length() != x.length())
            return false;

        // convert string to char array
        char[] firstArray = x.toCharArray();
        char[] secondArray = y.toCharArray();

        // sort both the arrays
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        // checking whether both strings are equal or not
        return Arrays.equals(firstArray,secondArray);
    }

}
