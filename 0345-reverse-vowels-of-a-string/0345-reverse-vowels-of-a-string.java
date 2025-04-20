public class Solution {
    public String reverseVowels(String s) {
        StringBuilder result = new StringBuilder(s);
        String vowels = "aeiouAEIOU";
        int left = 0, right = s.length() - 1; 

        while (left < right) {
           
            if (!vowels.contains(String.valueOf(s.charAt(left)))) {
                left++;
            }
            
            else if (!vowels.contains(String.valueOf(s.charAt(right)))) {
                right--;
            } else {
              
                char temp = s.charAt(left);
                result.setCharAt(left, s.charAt(right));
                result.setCharAt(right, temp);
                left++;
                right--;
            }
        }
        
        return result.toString();  
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
     
        System.out.println(sol.reverseVowels("IceCreAm")); 
        

        System.out.println(sol.reverseVowels("leetcode"));
    }
}
