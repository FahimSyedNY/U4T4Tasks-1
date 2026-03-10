public class ArrayAlgorithms {

    /**
     * Returns the average of all values in numList as a double.
     * PRECONDITION: numList.length > 0
     */
    public static double average(int[] numList) {
        int sum = 0;
        for (int i = 0; i < numList.length; i++) sum += numList[i];
        return (double) sum / numList.length;
    }

    /**
     * Returns the value in numList that represents the minimum
     * value in numList.
     * <p>
     * PRECONDITION: numList.length > 0
     */
    public static int minimum(int[] numList) {
        int min = numList[0];
        for (int i = 1; i < numList.length; i++) {
            if (numList[i] < min) min = numList[i];
        }
        return min;
    }

    /**
     * Returns the number of Strings in strList that contain the target.
     * <p>
     * PRECONDITIONS: strList.length > 0,
     * strList contains all non-null values
     */
    public static int howManyContain(String[] strList, String target) {
        int count = 0;
        for (int i = 0; i < strList.length; i++) {
            if (strList[i].contains(target)) count++;
        }
        return count;
    }

    /**
     * Returns an array containing all characters in myStr, in order.
     * <p>
     * PRECONDITION: myStr.length() > 0
     */
    public static String[] stringToArray(String myStr) {
        return myStr.split("");
    }

    /**
     * Prints each String in wordList, on its own line, in reverse order;
     * the characters of each string are also reversed.
     * <p>
     * PRECONDITION: wordList.length > 0
     */
    public static void reversePrint(String[] wordList) {
        for (int i = wordList.length - 1; i >= 0; i--) {
            String word = wordList[i];
            String reversed = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reversed += word.substring(j, j + 1);
            }
            System.out.println(reversed);
        }
    }

    /**
     * Returns a new array containing all elements from arr1 combined with
     * all elements from arr2; arr1's elements should be followed by
     * arr2's elements
     * <p>
     * PRECONDITION: arr1.length > 0, arr2.length > 0
     */
    public static int[] combine(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }
        return result;
    }
}