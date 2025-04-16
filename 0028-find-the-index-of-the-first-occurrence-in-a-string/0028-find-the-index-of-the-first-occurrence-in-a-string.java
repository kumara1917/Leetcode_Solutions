class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.equals(needle)) return 0;
        for (int i=0; i<haystack.length()-needle.length()+1;i++){
            String str=haystack.substring(i,i+needle.length());
            if (str.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}