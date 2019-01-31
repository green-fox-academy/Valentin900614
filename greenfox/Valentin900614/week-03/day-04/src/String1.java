public class String1 {
    public static void main(String[] args) {
        // Given a string, compute recursively (no loops) a new string where all the
        // lowercase 'x' chars have been changed to 'y' chars.

        System.out.println(csere("Asd x = y, or maxbe y = x", 'x', 'y'));

    }

    public static String csere (String string, char from, char to) {
        if (string.length() < 1) {
            return string;
        }
        else {
            char first = from == string.charAt(0) ? to : string.charAt(0);
            return first + csere(string.substring(1), from, to);
        }
    }

}
