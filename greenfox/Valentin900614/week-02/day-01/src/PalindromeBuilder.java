public class PalindromeBuilder {
    public static void main(String[] args) {
        System.out.println(palindroming("Nemár!"));
    }

    private static String palindroming(String string) {
        String backward = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            backward += string.charAt(i);
        }
        string += backward;

        return string;
    }
}
