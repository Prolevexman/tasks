package prolevexman.reverse.vowels.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsString345 {
    private static final Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public String reverseVowelString345(String string) {

        char[] arr = string.toCharArray();
        int leftPointer = 0;
        int rightPointer = string.length() - 1;

        while (leftPointer < rightPointer) {
            while (leftPointer < rightPointer && !isVowel(arr[leftPointer])) {
                leftPointer++;
            }

            while (leftPointer < rightPointer && !isVowel(arr[rightPointer])) {
                rightPointer--;
            }

            char temp = arr[leftPointer];
            arr[leftPointer] = arr[rightPointer];
            arr[rightPointer] = temp;
            leftPointer++;
            rightPointer--;
        }
        return new String(arr);
    }

    private boolean isVowel(char c) {
        char lower = Character.toLowerCase(c);
        return vowels.contains(lower);
    }
}
