import java.util.ArrayList;

public class Matrix {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(isSymmetric(list));
    }

    public static boolean isSymmetric (ArrayList<Integer> arrayList) {

        int[][] array = new int[arrayList.size()][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[arrayList.get(i)];
        }
        for(int i=0; i<arrayList.size(); i++){
            for (int j = 0; j < arrayList.get(i); j++) {
                array[i][j] = arrayList.get(j);
            }
        }

    /*    int[][] array = new int[arrayList.size()][];
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.size(); j++) {
                array[i][j] = arrayList.get(j);
            }
        }*/

        boolean a = false;
        boolean b = false;

        if (array[0][1] == array[1][0])
            a = true;
        if (array[1][2] == array[2][1])
            b = true;

        if (a && b)
            return true;
        else
            return false;
    }

}
