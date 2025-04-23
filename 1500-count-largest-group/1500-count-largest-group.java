import java.util.*;
class Solution {
    public int countLargestGroup(int n) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =1;i<=n;i++){
            int sum = 0;
            int num = i;
            while(num>0){
                sum+= num%10;
                num/= 10;
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }
        int maxsize = Collections.max(map.values());
        int count=0;
        for(int size: map.values()){
            if(size==maxsize){
                count++;
            }
        }
        return count;
        
    }
}