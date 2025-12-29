package prolevexman.can.place.flowers605;

public class CanPlaceFlowers605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean leftSide = (i == 0) || (flowerbed[i-1] == 0);
                boolean rightSide = (i == flowerbed.length - 1) || (flowerbed[i+1] == 0);

                if (leftSide && rightSide) {
                    flowerbed[i] = 1;
                    count++;
                    if (count >= n) {
                        return true;
                    }
                }
            }
        }
        return count >= n;
    }
}
