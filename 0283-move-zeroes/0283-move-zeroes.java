public class Solution {
    public void moveZeroes(int[] nums) {
        int position = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[position] = nums[i];
                if (position != i) {
                    nums[i] = 0;
                }
                position++;
            }
        }
    }
}