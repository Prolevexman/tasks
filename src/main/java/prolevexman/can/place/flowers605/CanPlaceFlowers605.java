package prolevexman.can.place.flowers605;

public class CanPlaceFlowers605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
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
