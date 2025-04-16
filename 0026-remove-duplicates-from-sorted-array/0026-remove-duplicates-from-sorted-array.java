import java.util.HashSet;
class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        HashSet <Integer> hash= new HashSet<>();
        for (int i=0; i<nums.length;i++){
            if (!hash.contains(nums[i])){
            hash.add(nums[i]);
            nums[count]=nums[i];
            count++;
            
            }
        } 
        return count;
    }
}