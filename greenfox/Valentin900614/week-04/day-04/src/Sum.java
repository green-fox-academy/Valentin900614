import java.util.ArrayList;

public class Sum {

    public int sumOfList (ArrayList<Integer> list) {
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        return sum;
    }

}
