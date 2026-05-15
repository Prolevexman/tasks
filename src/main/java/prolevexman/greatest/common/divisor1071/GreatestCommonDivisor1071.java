package prolevexman.greatest.common.divisor1071;

public class GreatestCommonDivisor1071 {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

    private int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    public String gcdOfStrings2(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcdLength = gcd2(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

    private int gcd2(int x, int y) {
        while (!(y == 0)) {
            int t = x % y;
            x = y;
            y = t;
        }
        return x;
    }

    public String gcdOfSeveralStrings(String... strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }

        String base = strings[0];

        for (String string: strings) {
            if (string == null || !(base + string).equals(string + base)) {
                return "";
            }
        }

        int gcdLength = base.length();

        for (int i = 0; i < strings.length; i++) {
            gcdLength = gcd3(gcdLength, strings[i].length());
        }
        return base.substring(0, gcdLength);
    }

    private int gcd3(int x, int y) {
        while (y != 0) {
            int t = x % y;
            x = y;
            y = t;
        }
        return x;
    }
}
