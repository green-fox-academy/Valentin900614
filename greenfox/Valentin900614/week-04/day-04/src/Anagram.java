import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println("Chill, I try to do my best!");
    }

    public boolean anagram (String x, String y) {
     /*   String x1 = x.replaceAll(" ", "");
        String y1 = y.replaceAll(" ", "");
        char a;
        char b;
        int sameChars = 0;
        for (int i = 0; i < x1.length(); i++) {
            a = x1.charAt(i);
            for (int j = 0; j < y1.length(); j++) {
                b = y1.charAt(j);
                if (a == b)
                    sameChars++;
            }
        }
        if (sameChars == x1.length()) {
            return true;
        }
        return false;
   */
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
