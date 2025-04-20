class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int seen=0;
        for(int num:nums){
                if(count==0){
                    seen = num;
                }
                 count+=(num==seen)?1:-1;
            }
            return seen;
           
        
    }
}