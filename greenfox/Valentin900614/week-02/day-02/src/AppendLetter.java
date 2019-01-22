import java.util.*;

public class AppendLetter{
    public static void main(String... args){
        ArrayList<String> far = new ArrayList<>(Arrays.asList("bo", "anacond", "koal", "pand", "zebr"));
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(appendA(far));
    }
    public static ArrayList appendA(ArrayList animals){
        for (int i = 0; i < animals.size(); i++) {
            animals.set(i, animals.get(i) + "a");
          }
        return animals;
    }
}