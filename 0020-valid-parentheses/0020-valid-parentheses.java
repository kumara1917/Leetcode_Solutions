import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack= new Stack<>();

        if (s.length()%2==1){
            return false;
        }
        for (int i=0; i<s.length();i++){
            if (s.charAt(i)=='(' ||s.charAt(i)=='{' ||s.charAt(i)=='[' ){
                stack.push(s.charAt(i));
            }
            else{
                char ch= s.charAt(i)==')' ? '(': (s.charAt(i)==']'? '[':'{');
                if (!stack.isEmpty()){
                char c=stack.pop();
                if (c!=ch){

                    return false;
                }
            }else{
                return false;
            }
            }
        }
        if (!stack.isEmpty()){
            return false;
        }
    return true;
    }
}