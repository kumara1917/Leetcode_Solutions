class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        for (int i=s.length()-1; i>=0;i--){
            if (Character.isLetter(s.charAt(i))){
                count++;
            }
            if (s.charAt(i)==' ' && count>0){
                return count;
            }
        }
        return count;
    }
}