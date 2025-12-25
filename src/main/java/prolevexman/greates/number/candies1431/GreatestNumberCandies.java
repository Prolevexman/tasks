package prolevexman.greates.number.candies1431;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GreatestNumberCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        if (candies == null)
            throw new IllegalArgumentException("Candies array must not be null");

        if (candies.length == 0) {
            return Collections.emptyList();
        }

        int maxCandies = candies[0];

        for (int c: candies) {
            maxCandies = Math.max(maxCandies, c);
        }

        List<Boolean> answer = new ArrayList<>();

        for(int c: candies) {
                answer.add(c + extraCandies >= maxCandies);
        }
        return answer;
    }
}
