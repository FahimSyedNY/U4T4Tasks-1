public class Main {
    public static void main(String[] args) {
        System.out.println("----- average -----");
        int[] nums = {6, 4, 0, 3, 9};
        double avg = ArrayAlgorithms.average(nums);
        System.out.println(avg);

        int[] nums2 = {4, 6, 7, 10, -2, 17, 5};
        double avg2 = ArrayAlgorithms.average(nums2);
        System.out.println(avg2);

        int[] nums3 = {7, 3};
        double avg3 = ArrayAlgorithms.average(nums3);
        System.out.println(avg3);

        System.out.println("\n----- minimum -----");

        int[] nums4 = {6, 4, 3, 9, 2, 5};
        int min = ArrayAlgorithms.minimum(nums4);
        System.out.println(min);

        int[] nums5 = {-4, 5, -7, 3};
        int min2 = ArrayAlgorithms.minimum(nums5);
        System.out.println(min2);

        int[] nums6 = {0, -5, -4, -6};
        int min3 = ArrayAlgorithms.minimum(nums6);
        System.out.println(min3);

        int[] nums7 = {10, 40, 20, 30, 50};
        int min4 = ArrayAlgorithms.minimum(nums7);
        System.out.println(min4);

        System.out.println("\n----- howManyContain -----");

        String[] words = {"apple", "banana", "cabana", "diva", "elephant"};

        int count = ArrayAlgorithms.howManyContain(words, "a");
        System.out.println(count);

        int count2 = ArrayAlgorithms.howManyContain(words, "an");
        System.out.println(count2);

        int count3 = ArrayAlgorithms.howManyContain(words, "ban");
        System.out.println(count3);

        int count4 = ArrayAlgorithms.howManyContain(words, "h");
        System.out.println(count4);

        int count5 = ArrayAlgorithms.howManyContain(words, "k");
        System.out.println(count5);

        System.out.println("---------");

        String[] words2 = {"i", "am", "sam"};

        int count6 = ArrayAlgorithms.howManyContain(words2, "i");
        System.out.println(count6);

        int count7 = ArrayAlgorithms.howManyContain(words2, "am");
        System.out.println(count7);

        int count8 = ArrayAlgorithms.howManyContain(words2, "sam");
        System.out.println(count8);

        int count9 = ArrayAlgorithms.howManyContain(words2, "sam i am");
        System.out.println(count9);

        System.out.println("\n----- stringToArray -----");

        String word = "Computer Science!";
        String[] letters = ArrayAlgorithms.stringToArray(word);

        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i]);
        }

        System.out.println();

        String word2 = "* ** *** **** ***** ******";
        String[] letters2 = ArrayAlgorithms.stringToArray(word2);

        for (int i = 0; i < letters2.length; i++) {
            System.out.print(letters2[i]);
        }

        System.out.println();

        System.out.println("\n----- reversePrint -----");

        String[] words3 = {"apple", "banana", "cabana", "diva", "elephant"};
        ArrayAlgorithms.reversePrint(words3);

        System.out.println();

        String[] words4 = {"123", "456", "789"};
        ArrayAlgorithms.reversePrint(words4);

        System.out.println("\n----- combine -----");

        int[] nums8 = {1, 2, 3, 4, 5, 6};
        int[] nums9 = {10, 11, 12, 13, 14, 15, 16, 17};

        int[] combined = ArrayAlgorithms.combine(nums8, nums9);

        for (int i = 0; i < combined.length; i++) {
            System.out.print(combined[i] + " ");
        }

        System.out.println();
        System.out.println("combined list has " + combined.length + " elements");

        int[] nums10 = {5, 8, 6, 2};
        int[] nums11 = {1, 7, 10, 0, 9};

        int[] combined2 = ArrayAlgorithms.combine(nums10, nums11);

        for (int i = 0; i < combined2.length; i++) {
            System.out.print(combined2[i] + " ");
        }

        System.out.println();
        System.out.println("combined list has " + combined2.length + " elements");
    }
}