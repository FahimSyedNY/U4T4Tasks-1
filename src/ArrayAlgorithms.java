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

    public static void bookEnd(int[] nums, int num) {
        nums[0] = num;
        nums[nums.length - 1] = num;
    }

    public static void multiplyBy(int[] numList, int multiplier) {
        for (int i = 0; i < numList.length; i++) {
            numList[i] *= multiplier;
        }
    }

    public static int[] multiplyByNoModify(int[] numList, int multiplier) {
        int[] result = new int[numList.length];
        for (int i = 0; i < numList.length; i++) {
            result[i] = numList[i] * multiplier;
        }
        return result;
    }

    public static void shiftLeft(int[] numList) {
        int first = numList[0];
        for (int i = 0; i < numList.length - 1; i++) {
            numList[i] = numList[i + 1];
        }
        numList[numList.length - 1] = first;
    }

    public static void shiftRight(int[] numList) {
        int last = numList[numList.length - 1];
        for (int i = numList.length - 1; i > 0; i--) {
            numList[i] = numList[i - 1];
        }
        numList[0] = last;
    }

    /*
    public static void reverse(int[] numList) {
        int[] copy = new int[numList.length];
        for (int i = 0; i < numList.length; i++) {
            copy[i] = numList[i];
        }
        for (int i = 0; i < numList.length; i++) {
            numList[i] = copy[numList.length - 1 - i];
        }
    }
    */

    public static void reverse(int[] numList) {
        for (int i = 0; i < numList.length / 2; i++) {
            int temp = numList[i];
            numList[i] = numList[numList.length - 1 - i];
            numList[numList.length - 1 - i] = temp;
        }
    }

    /** Returns the longest String in the array.
     * If multiple strings tie for longest length, return the last one.
     */
    public static String longestString(String[] stringList) {
        String longest = stringList[0];
        for (String str : stringList) {
            if (str.length() >= longest.length()) longest = str;
        }
        return longest;
    }


    /** Returns a NEW array with all words converted to lowercase.
     * Does NOT modify the original array.
     */
    public static String[] makeLowercase(String[] wordList) {
        String[] result = new String[wordList.length];
        for (int i = 0; i < wordList.length; i++) {
            result[i] = wordList[i].toLowerCase();
        }
        return result;
    }


    /** Updates each String in the array to uppercase.
     * Modifies the original array.
     */
    public static void makeUppercase(String[] wordList) {
        for (int i = 0; i < wordList.length; i++) {
            wordList[i] = wordList[i].toUpperCase();
        }
    }


    /** Returns a new array containing the larger value
     * at each index from the two arrays.
     */
    public static int[] arrayMaximums(int[] intArr1, int[] intArr2) {
        int[] result = new int[intArr1.length];
        for (int i = 0; i < intArr1.length; i++) {
            result[i] = Math.max(intArr1[i], intArr2[i]);
        }
        return result;
    }


    /** Counts how many numbers are the same as the number immediately to their right.
     */
    public static int countConsecutiveDoubles(int[] numList) {
        int count = 0;
        for (int i = 0; i < numList.length - 1; i++) {
            if (numList[i] == numList[i + 1]) count++;
        }
        return count;
    }

    /** Returns the longest streak of the same number appearing consecutively.
     */
    public static int longestStreak(int[] nums) {
        int longest = 1;
        int current = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) current++;
            else current = 1;
            if (current > longest) longest = current;
        }
        return longest;
    }
}