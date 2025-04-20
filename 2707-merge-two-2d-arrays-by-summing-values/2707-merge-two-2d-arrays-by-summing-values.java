class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> result = new HashMap<>();

        for (int[] num : nums1) {
            result.put(num[0], result.getOrDefault(num[0], 0) + num[1]);
        }
        for (int[] num : nums2) {
            result.put(num[0], result.getOrDefault(num[0], 0) + num[1]);
        }
        List<int[]> mergedList = new ArrayList<>();
        for (int id : result.keySet()) {
            mergedList.add(new int[]{id, result.get(id)});
        }
        mergedList.sort(Comparator.comparingInt(a -> a[0]));
        int[][] resultArray = new int[mergedList.size()][2];
        for (int i = 0; i < mergedList.size(); i++) {
            resultArray[i] = mergedList.get(i);
        }
        return resultArray;
    }
}