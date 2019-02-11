import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubInt {
    public static void main(String[] args) {
        //  Create a function that takes a number and a list of numbers as a parameter
        //  Returns the indeces of the numbers in the list where the first number is part of
        //  Returns an empty list if the number is not part any of the numbers in the list

        //  Example:
        System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
        //  should print: '[]'
    }

    public static List subInt (int number, int[] array) {
        List<Integer> list = new ArrayList<>();
        List<Integer> returnList = new ArrayList<>();
        String num = Integer.toString(number);
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).toString().contains(num)) {
                returnList.add(list.get(i));
            }
        }
        return returnList;
    }

}