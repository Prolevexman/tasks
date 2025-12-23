package prolevexman;

import prolevexman.greatest.common.divisor1071.GreatestCommonDivisor1071;
import prolevexman.merge.strings.alternately1768.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String word1 = "dus";
        String word2 = "sydgcia";
        String word3 = "sioi";
        String word4 = "pwok";
        String str1 = "abcabc";
        String str2 = "abcabcabcabc";

        MergeStringsAlternately1768 mergeStringsAlternately1768 = new MergeStringsAlternately1768();

        GreatestCommonDivisor1071 greatestCommonDivisor1071 = new GreatestCommonDivisor1071();


        System.out.println(mergeStringsAlternately1768.mergeTwoStrings(word1, word2));
        System.out.println(mergeStringsAlternately1768.mergeSeveralStrings(word1, word2, word3, word4, null));
        System.out.println(mergeStringsAlternately1768.mergeSeveralStrings2(word1, word2, word3, word4, null));
        System.out.println(mergeStringsAlternately1768.mergeSeveralStrings3(word1, word2, word3, word4, null));

        System.out.println(greatestCommonDivisor1071.gcdOfStrings(str1, str2));
    }
}
