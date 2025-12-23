package prolevexman.merge.strings.alternately1768;

public class MergeStringsAlternately1768 {
    public String mergeTwoStrings (String word1, String word2) {

        if (word1 == null) word1 = "";
        if (word2 == null) word2 = "";

        StringBuilder sb = new StringBuilder(word1.length() + word2.length());

        for (int i = 0; i < Math.max(word1.length(), word2.length()); i++) {
            if (i < word1.length()) {
                sb.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }

    public String mergeSeveralStrings (String... words) {
        int resultLength = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i] == null) words[i] = "";
            resultLength = resultLength + words[i].length();
        }

        boolean flag = true;
        int j = 0;
        StringBuilder sb = new StringBuilder(resultLength);

        while (flag) {
            flag = false;
            for (String word: words) {
                if (j < word.length()) {
                    sb.append(word.charAt(j));
                    flag = true;
                }
            }
            j++;
        }
        return sb.toString();
    }

    public String mergeSeveralStrings2 (String... words) {
        int resultLength = 0;
        int maxLength = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i] == null) words[i] = "";
            resultLength = resultLength + words[i].length();
            maxLength = Math.max(maxLength, words[i].length());
        }

        StringBuilder sb = new StringBuilder(resultLength);

        for (int i = 0; i < maxLength; i++) {
            for (String word: words) {
                if (i < word.length()) {
                    sb.append(word.charAt(i));
                }
            }
        }
        return sb.toString();
    }

    public String mergeSeveralStrings3 (String... words) {
        int resultLength = 0;
        int maxLength = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i] == null) words[i] = "";
            resultLength = resultLength + words[i].length();
            maxLength = Math.max(maxLength, words[i].length());
        }

        char[] array = new char[resultLength];
        int j = 0;
        int k = 0;

        while (j < maxLength) {
            for (String word: words) {
                if (j < word.length()) {
                    array[k++] = word.charAt(j);
                }
            }
            j++;
        }
        return new String(array);
    }
}
