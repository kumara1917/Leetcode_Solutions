class Solution {
    public int findShortestSubArray(int[] nums) {
        int[] firstIndex = new int[50000];
        int[] lastIndex = new int[50000];
        int[] count = new int[50000];

        int degree = 0, minLength = nums.length;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (count[num] == 0) firstIndex[num] = i;
            lastIndex[num] = i;
            count[num]++;
            degree = Math.max(degree, count[num]);
        }

        for (int num = 0; num < 50000; num++) {
            if (count[num] == degree) {
                minLength = Math.min(minLength, lastIndex[num] - firstIndex[num] + 1);
            }
        }

        return minLength;
    }
}