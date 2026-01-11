package prolevexman.move.zeroes283;

public class MoveZeroes283 {
    public void moveZeroes(int[] nums) {
        int slowIndex = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0) {
                nums[slowIndex] = nums[i];
                slowIndex++;
            }
        }
        while (slowIndex < nums.length) {
            nums[slowIndex++] = 0;
        }
    }
}
