import java.util.*;
class Solution {
    public boolean areOccurrencesEqual(String s) {
        List<Character> charlist = new ArrayList<>();
        for(char c : s.toCharArray()){
            charlist.add(c);
        }
        Set<Integer> freqset = new HashSet<>();
        for(char c : charlist){
            freqset.add(Collections.frequency(charlist,c));
        }
        return freqset.size()==1;    
    }
}