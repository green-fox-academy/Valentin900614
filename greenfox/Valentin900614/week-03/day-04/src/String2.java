public class String2 {
    public static void main(String[] args) {
        // Given a string, compute recursively a new string where all the 'x' chars have been removed.

        System.out.println(csere("Asd x = y, or maxbe y = x", 'x'));

    }

    public static String csere (String string, char toRemove) {
        if (string.length() < 1) {
            return string;
        }
        else {
            if (string.charAt(0) != toRemove) {
                char a = string.charAt(0);
                return a + csere(string.substring(1), toRemove);
            } else {
                return csere(string.substring(1), toRemove);
            }
        }
    }
}
