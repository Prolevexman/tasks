package prolevexman;

import prolevexman.can.place.flowers605.CanPlaceFlowers605;
import prolevexman.greates.number.candies1431.GreatestNumberCandies;
import prolevexman.greatest.common.divisor1071.GreatestCommonDivisor1071;
import prolevexman.merge.strings.alternately1768.*;
import prolevexman.reverse.vowels.string.ReverseVowelsString345;

public class Main {
    public static void main(String[] args) {
        String word1 = "dus";
        String word2 = "sydgcia";
        String word3 = "sioi";
        String word4 = "pwok";
        String str1 = "abc";
        String str2 = "abcabcabcabc";
        String str3 = "abcabcabcabcabcabc";

        int[] candies = {1, 2, 5, 6, 7};
        int extraCandies = 3;

        int[] flowerbed = {0, 1, 1, 1, 0, 0, 0, 1, 0, 0};
        int n = 2;

        String reverseVowels = "SpaCEmArine";

        MergeStringsAlternately1768 mergeStringsAlternately1768 = new MergeStringsAlternately1768();

        GreatestCommonDivisor1071 greatestCommonDivisor1071 = new GreatestCommonDivisor1071();

        GreatestNumberCandies greatestNumberCandies = new GreatestNumberCandies();

        CanPlaceFlowers605 canPlaceFlowers605 = new CanPlaceFlowers605();

        ReverseVowelsString345 reverseVowelsString345 = new ReverseVowelsString345();

        Tt tt = new Tt();


        System.out.println(mergeStringsAlternately1768.mergeTwoStrings(word1, word2));
        System.out.println(mergeStringsAlternately1768.mergeSeveralStrings(word1, word2, word3, word4, null));
        System.out.println(mergeStringsAlternately1768.mergeSeveralStrings2(word1, word2, word3, word4, null));
        System.out.println(mergeStringsAlternately1768.mergeSeveralStrings3(word1, word2, word3, word4, null));
        System.out.println(tt.tt1(word1, word2, word3, word4, null));
        System.out.println(tt.tt2(word1, word2, word3, word4, null));

        System.out.println(greatestCommonDivisor1071.gcdOfStrings(str1, str2));
        System.out.println(greatestCommonDivisor1071.gcdOfStrings2(null, str2));
        System.out.println(greatestCommonDivisor1071.gcdOfSeveralStrings(str1, str2, str3));
        System.out.println(tt.tt3(str1, str2, str3));
        System.out.println(greatestNumberCandies.kidsWithCandies(candies, extraCandies));
        System.out.println(tt.tt4(candies, extraCandies));
        System.out.println(canPlaceFlowers605.canPlaceFlowers(flowerbed, n));
        System.out.println(tt.tt5(flowerbed, n));
        System.out.println(reverseVowelsString345.reverseVowelString345(reverseVowels));
        System.out.println(tt.tt6(reverseVowels));
    }
}
