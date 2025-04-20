import java.util.*;
class Solution {
    public String[] findWords(String[] words) {
        String[]rows = {"qwertyuiop","asdfghjkl","zxcvbnm"};
        List<String> res = new ArrayList<>();
        for(String word : words){
            String lowercase = word.toLowerCase();
            for(String row:rows){
            if(lowercase.chars().allMatch(c->row.indexOf(c)!=-1)){
                res.add(word);
                break;
            }
        }
    }
    return res.toArray(new String[0]);
}

}