class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int minLength = Math.min(nums1.length, nums2.length);
        int[] temp = new int[minLength];
        int count = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    boolean isDuplicate = false;
                    for (int k = 0; k < count; k++) {
                        if (temp[k] == nums1[i]) {
                            isDuplicate = true;
                            break;
                        }
                    }
                    if (!isDuplicate) {
                        temp[count++] = nums1[i];
                    }
                    break; 
                }
            }
        }

        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}