public class Reverse {
    public static void main(String[] args){
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

        System.out.println(reverse(reversed));
    }
    public static String reverse(String smthng) {
        char help;
        String uj = "";
        for (int i = 0; i < smthng.length(); i++) {
            help = smthng.charAt(smthng.length() - 1 - i);
            uj += help;
        }
        return uj;
    }
}