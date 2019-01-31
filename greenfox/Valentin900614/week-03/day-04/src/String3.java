public class String3 {
    public static void main(String[] args) {
        // Given a string, compute recursively a new string where all the
        // adjacent chars are now separated by a "*".

        System.out.println(csere("Asd x = y, or maxbe y = x", ' ', '*'));

    }

    public static String csere (String string, char space, char after) {
        if (string.length() < 1) {
            return string;
        }
        else {
            if (string.charAt(0) != space) {
                char a = string.charAt(0);
                return a + csere(string.substring(1), space, after);
            } else {
                return after + csere(string.substring(1), space, after);
            }
        }
    }
}
