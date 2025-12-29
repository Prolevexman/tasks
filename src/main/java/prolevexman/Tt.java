package prolevexman;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tt {
    public String tt1(String... words) {
        int maxLength = 0;
        int tlw = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i] == null) words[i] = "";
            maxLength = maxLength + words[i].length();
            tlw = Math.max(tlw, words[i].length());
        }

        StringBuilder sb = new StringBuilder(maxLength);

        for (int i = 0; i < tlw; i++) {
            for(String word: words) {
                if (i < word.length()) {
                    sb.append(word.charAt(i));
                }
            }
        }
        return sb.toString();
    }

    public String tt2(String... words) {
        int maxLength = 0;
        int tlw = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i] == null) words[i] = "";
            maxLength = maxLength + words[i].length();
            tlw = Math.max(tlw, words[i].length());

        }

        char[] array = new char[maxLength];
        int i = 0;
        int k = 0;

        while (i < tlw) {
            for (String word: words) {
                if (i < word.length()) {
                    array[k++] = word.charAt(i);
                }
            }
            i++;
        }
        return new String(array);
    }

    public String tt3(String... strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }

        String base = strings[0];

        for(String string: strings) {
            if (string == null || !(base + string).equals(string + base)) {
                return "";
            }
        }

        int maxgcd = base.length();
        for(String string: strings) {
            maxgcd = gcd(maxgcd, string.length());
        }
        return base.substring(0, maxgcd);
    }

    private int gcd(int x, int y) {
        while (y != 0) {
            int t = x % y;
            x = y;
            y = t;
        }
        return x;
    }

    private int gcd1(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd1(y, x % y);
    }

    public List<Boolean> tt4 (int[] candies, int extraCandy) {
        int maxCandies = 0;

        if (candies == null) {
            throw new IllegalArgumentException("must not be null");
        }

        if (candies.length == 0) {
            return Collections.emptyList();
        }

        for(int candie: candies) {
            maxCandies = Math.max(maxCandies, candie);
        }

        List<Boolean> result = new ArrayList<>(candies.length);

        for (int candie: candies) {
            result.add(candie + extraCandy >= maxCandies);
        }
        return result;
    }


}
