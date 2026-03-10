public class Main {
    public static void main(String[] args) {
        System.out.println("=== U4T4: Task 1 Tests ===");

        // ArrayAlgorithms: average, minimum, howManyContain, stringToArray, reversePrint, combine
        int[] nums = {6, 4, 0, 3, 9};
        double avg = ArrayAlgorithms.average(nums);
        System.out.println(avg);
        int[] nums2 = {4, 6, 7, 10, -2, 17, 5};
        double avg2 = ArrayAlgorithms.average(nums2);
        System.out.println(avg2);
        int[] nums3 = {7, 3};
        double avg3 = ArrayAlgorithms.average(nums3);
        System.out.println(avg3);

        int[] numsMin = {6, 4, 3, 9, 2, 5};
        System.out.println(ArrayAlgorithms.minimum(numsMin));
        int[] numsMin2 = {-4, 5, -7, 3};
        System.out.println(ArrayAlgorithms.minimum(numsMin2));
        int[] numsMin3 = {0, -5, -4, -6};
        System.out.println(ArrayAlgorithms.minimum(numsMin3));
        int[] numsMin4 = {10, 40, 20, 30, 50};
        System.out.println(ArrayAlgorithms.minimum(numsMin4));

        String[] words = {"apple", "banana", "cabana", "diva", "elephant"};
        System.out.println(ArrayAlgorithms.howManyContain(words, "a"));
        System.out.println(ArrayAlgorithms.howManyContain(words, "an"));
        System.out.println(ArrayAlgorithms.howManyContain(words, "ban"));
        System.out.println(ArrayAlgorithms.howManyContain(words, "h"));
        System.out.println(ArrayAlgorithms.howManyContain(words, "k"));
        System.out.println("---------");
        String[] words2 = {"i", "am", "sam"};
        System.out.println(ArrayAlgorithms.howManyContain(words2, "i"));
        System.out.println(ArrayAlgorithms.howManyContain(words2, "am"));
        System.out.println(ArrayAlgorithms.howManyContain(words2, "sam"));
        System.out.println(ArrayAlgorithms.howManyContain(words2, "sam i am"));

        String word = "Computer Science!";
        String[] letters = ArrayAlgorithms.stringToArray(word);
        for (String c : letters) System.out.print(c);
        System.out.println();
        String word2 = "* ** *** **** ***** ******";
        String[] letters2 = ArrayAlgorithms.stringToArray(word2);
        for (String c : letters2) System.out.print(c);
        System.out.println();

        String[] revWords = {"apple", "banana", "cabana", "diva", "elephant"};
        ArrayAlgorithms.reversePrint(revWords);
        System.out.println();
        String[] revWords2 = {"123", "456", "789"};
        ArrayAlgorithms.reversePrint(revWords2);

        int[] numsC1 = {1, 2, 3, 4, 5, 6};
        int[] numsC2 = {10, 11, 12, 13, 14, 15, 16, 17};
        int[] combined = ArrayAlgorithms.combine(numsC1, numsC2);
        for (int n : combined) System.out.print(n + " ");
        System.out.println();
        System.out.println("combined list has " + combined.length + " elements");

        int[] numsC3 = {5, 8, 6, 2};
        int[] numsC4 = {1, 7, 10, 0, 9};
        int[] combined2 = ArrayAlgorithms.combine(numsC3, numsC4);
        for (int n : combined2) System.out.print(n + " ");
        System.out.println();
        System.out.println("combined list has " + combined2.length + " elements");

        System.out.println("\n=== U4T4: Task 2 Tests ===");

        // bookEnd test
        int[] grades1 = {34, 78, 91, 34, 76, 45};
        ArrayAlgorithms.bookEnd(grades1, 20);
        for (int g : grades1) System.out.print(g + " ");
        System.out.println();

        int[] grades2 = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        ArrayAlgorithms.bookEnd(grades2, 0);
        for (int g : grades2) System.out.print(g + " ");
        System.out.println();

        int[] grades3 = {50};
        ArrayAlgorithms.bookEnd(grades3, 100);
        for (int g : grades3) System.out.print(g + " ");
        System.out.println();

        // multiplyBy test
        int[] numsMul = {5, 10, 15, 12, 2, 4};
        ArrayAlgorithms.multiplyBy(numsMul, 6);
        for (int n : numsMul) System.out.print(n + " ");
        System.out.println();

        int[] numsMul2 = {-5, -7, 14, 0, 5, 20, -30};
        ArrayAlgorithms.multiplyBy(numsMul2, -12);
        for (int n : numsMul2) System.out.print(n + " ");
        System.out.println();

        // multiplyByNoModify test
        int[] numsNoMod = {5, 10, 15, 12, 2, 4};
        int[] result = ArrayAlgorithms.multiplyByNoModify(numsNoMod, 6);
        for (int n : result) System.out.print(n + " ");
        System.out.println();
        for (int n : numsNoMod) System.out.print(n + " ");
        System.out.println();

        // shiftLeft test
        int[] shiftLeft1 = {5, 1, 3, 4, 7, 6};
        ArrayAlgorithms.shiftLeft(shiftLeft1);
        for (int n : shiftLeft1) System.out.print(n + " ");
        System.out.println();

        int[] shiftLeft2 = {1, 2, 3, 4, 5, 6, 7, 8};
        ArrayAlgorithms.shiftLeft(shiftLeft2);
        for (int n : shiftLeft2) System.out.print(n + " ");
        System.out.println();
        ArrayAlgorithms.shiftLeft(shiftLeft2);
        for (int n : shiftLeft2) System.out.print(n + " ");
        System.out.println();
        ArrayAlgorithms.shiftLeft(shiftLeft2);
        for (int n : shiftLeft2) System.out.print(n + " ");
        System.out.println();

        // shiftRight test
        int[] shiftRight1 = {6, 1, 3, 4, 7, 5};
        ArrayAlgorithms.shiftRight(shiftRight1);
        for (int n : shiftRight1) System.out.print(n + " ");
        System.out.println();
        int[] shiftRight2 = {1, 2, 3, 4, 5, 6, 7, 8};
        ArrayAlgorithms.shiftRight(shiftRight2);
        for (int n : shiftRight2) System.out.print(n + " ");
        System.out.println();
        ArrayAlgorithms.shiftRight(shiftRight2);
        for (int n : shiftRight2) System.out.print(n + " ");
        System.out.println();
        ArrayAlgorithms.shiftRight(shiftRight2);
        for (int n : shiftRight2) System.out.print(n + " ");
        System.out.println();

        // reverse test
        int[] even = {1, 2, 3, 4, 5, 6};
        ArrayAlgorithms.reverse(even);
        for (int n : even) System.out.print(n + " ");
        System.out.println();
        int[] odd = {1, 2, 3, 4, 5, 6, 7};
        ArrayAlgorithms.reverse(odd);
        for (int n : odd) System.out.print(n + " ");
        System.out.println();

        System.out.println("=== Task 1: Warm-Up ===");

        // a. print names one per line
        String[] names = {"Mateo", "Sofia", "David", "Ziggy", "Charlie"};
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("\n---");

        // b. sum numbers using enhanced for loop
        nums = new int[]{8, 4, 10, 5, 7, 11, 3, 9, 23, 6};
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println(sum);

        System.out.println("\n---");

        // c. create array of Person objects and update names to uppercase
        Person p1 = new Person("Adam", 12);
        Person p2 = new Person("Barb", 15);
        Person p3 = new Person("Cathy", 14);
        Person p4 = new Person("Fred", 16);

        Person[] people = {p1, p2, p3, p4};
        for (Person p : people) {
            p.setName(p.getName().toUpperCase());
            p.introduce();
        }

        System.out.println("\n---");

        // d. triple each element (standard for loop, because enhanced for cannot modify array)
        int[] values = {6, 2, 1, 7, 12, 5};
        for (int i = 0; i < values.length; i++) {
            values[i] *= 3;
        }
        System.out.println("Array after tripling:");
        for (int val : values) {
            System.out.print(val + " ");
        }
        System.out.println();

        System.out.println("\n=== Task 2: Array Methods ===");

        // longestString
        String[] strings = {"hello", "hola", "hi", "apple", "why?"};
        System.out.println(ArrayAlgorithms.longestString(strings));
        String[] strings2 = {"cut", "boy", "mom", "she"};
        System.out.println(ArrayAlgorithms.longestString(strings2));
        String[] strings3 = {"M", "DA", "B", "FAD"};
        System.out.println(ArrayAlgorithms.longestString(strings3));
        String[] strings4 = {"hello", "holler", "hi", "apple", "why?"};
        System.out.println(ArrayAlgorithms.longestString(strings4));

        System.out.println("\n---");

        // makeLowercase
        String[] strings5 = {"HELLO", "Halo", "Adam", "what", "booyAH", "WHY?"};
        String[] lower = ArrayAlgorithms.makeLowercase(strings5);
        for (String str : lower) System.out.print(str + " ");
        System.out.println("\nOriginal array not modified:");
        for (String str : strings5) System.out.print(str + " ");
        System.out.println();

        System.out.println("\n---");

        // makeUppercase
        String[] strings9 = {"HELlo", "Halo", "WHAT!", "Adam", "what", "booyAH", "WHY?", "for"};
        ArrayAlgorithms.makeUppercase(strings9);
        for (String str : strings9) System.out.print(str + " ");
        System.out.println();

        System.out.println("\n---");

        // arrayMaximums
        int[] arr1 = {2, 5, 6, 1, 0, -6, 10};
        int[] arr2 = {1, 7, 6, -2, 8, -8, 8};
        int[] maximums = ArrayAlgorithms.arrayMaximums(arr1, arr2);
        for (int num : maximums) System.out.print(num + " ");
        System.out.println("\nOriginal arrays not modified:");
        for (int num : arr1) System.out.print(num + " ");
        System.out.println();
        for (int num : arr2) System.out.print(num + " ");
        System.out.println();

        System.out.println("\n---");

        // countConsecutiveDoubles
        int[] nums10 = {4, 7, 7, 3, 2, 2, 4, 4, 4, 6, 4, 6, 6};
        System.out.println(ArrayAlgorithms.countConsecutiveDoubles(nums10));
        int[] nums11 = {1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2};
        System.out.println(ArrayAlgorithms.countConsecutiveDoubles(nums11));
        int[] nums12 = {1, 2, 1, 3, 1, 2, 1, 3, 1, 2, 1, 3};
        System.out.println(ArrayAlgorithms.countConsecutiveDoubles(nums12));

        System.out.println("\n---");

        // longestStreak
        int[] nums13 = {10, 20, 10, 30, 10, 20, 10, 30, 10, 20, 10, 30};
        System.out.println(ArrayAlgorithms.longestStreak(nums13));
        int[] nums14 = {10, 10, 20, 20, 20, 30, 30, 30, 30, 40, 40, 50};
        System.out.println(ArrayAlgorithms.longestStreak(nums14));
        int[] nums15 = {10, 10, 10, 10, 10, 10, 20, 20, 30, 30, 30, 30};
        System.out.println(ArrayAlgorithms.longestStreak(nums15));
        int[] nums16 = {20, 20, 30, 30, 30, 30, 10, 10, 10, 10, 10, 10};
        System.out.println(ArrayAlgorithms.longestStreak(nums16));
        int[] nums17 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        System.out.println(ArrayAlgorithms.longestStreak(nums17));
    }
}