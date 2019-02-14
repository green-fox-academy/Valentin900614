public class Bubble {
    public static void main(String[] args) {
                //  Create a function that takes a list of numbers as parameter
                //  Returns a list where the elements are sorted in ascending numerical order
                //  Make a second boolean parameter, if it's `true` sort that list descending

                //  Example:
                System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));

                //  should print [5, 9, 12, 24, 34]
                System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
                //  should print [34, 24, 12, 9, 5]
    }

    private static int[] bubble(int[] array){
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array [j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
      /*  for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }*/
        return array;
    }

    private static int[] advancedBubble(int[] array, boolean ask) {
        int temp;
        if (ask) {
            for (int i = 1; i < array.length; i++) {
                for (int j = i; j > 0; j--) {
                    if (array[j] > array[j - 1]) {
                        temp = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = temp;
                    }
                }
            }
      /*  for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }*/

        }
        return array;
    }

}

