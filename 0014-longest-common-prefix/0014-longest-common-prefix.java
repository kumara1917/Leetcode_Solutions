class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result="";
        int min=Integer.MAX_VALUE;
        for (int i=0; i<strs.length;i++){
            if (min>strs[i].length()){
            min=strs[i].length();}
        }
        for (int  i=0; i<min; i++){
            boolean flag=false;
            char c=' ';
            for (int j=0; j<strs.length;j++){
                
                c=strs[0].charAt(i);
                if (strs[j].charAt(i)==c){
                    flag= true;
                }
                else{
                    return result;
                }
            }
            if (flag){
                result+=c;
            }
        }
    return result;
    }
}