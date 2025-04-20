class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] result = new int[nums.length];
        int left = 0, count = 0;
        for (int num : nums) {
            if (num < pivot) result[left++] = num;
            else if (num == pivot) count++;
        }
        for (int i = 0; i < count; i++) {
            result[left++] = pivot;
        }
        for (int num : nums) {
            if (num > pivot) result[left++] = num;
        }


        return result;
    }
}
