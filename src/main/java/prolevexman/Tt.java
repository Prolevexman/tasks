package prolevexman;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tt {
    //строки через билдер
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
            for (String word: words) {
                if (i < word.length()) {
                    sb.append(word.charAt(i));
                }
            }
        }
        return sb.toString();
    }

    //строки через массив
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

    //делитель через рекурсию и цикл
    public String tt3(String... strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }

        String base = strings[0];

        for (String string: strings) {
            if (string.length() == 0 || !(base + string).equals(string + base)) {
                return "";
            }
        }

        int gcdLength = base.length();

        for (int i = 0; i < strings.length; i++){
            gcdLength = gcd(gcdLength, strings[i].length());
        }
        return base.substring(0, gcdLength);
    }

    private int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }

    private int gcd1(int x, int y) {
        while (y != 0) {
            int t = x % y;
            x = y;
            y = t;
        }
        return x;
    }

    //свечи
    public List<Boolean> tt4 (int[] candies, int extraCandy) {

        if (candies == null) {
            throw new IllegalArgumentException("should not be empty");
        }

        if (candies.length == 0) {
            return  Collections.emptyList();
        }
        int maxCandies = 0;

        for (int candie: candies) {
            maxCandies = Math.max(maxCandies, candie);
        }

        List<Boolean> result = new ArrayList<>(candies.length);

        for (int candie: candies) {
            result.add(candie + extraCandy >= maxCandies);
        }
        return result;
    }

    //возможность посадки цветка
    public boolean tt5(int[] flowerbed, int n) {
        int count = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            int left = (i == 0) ? 0 : flowerbed[i - 1];
            int right = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1];

            if (left == 0 && flowerbed[i] == 0 && right == 0) {
                count++;
                i++;
                if (count >= n) {
                    return true;
                }
            }
        }
        return count >= n;
    }


}
