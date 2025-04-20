import java.util.Scanner;
class Solution {
    public boolean isUgly(int n) {
        Scanner sc = new Scanner(System.in);
        if(n<=0){
            return false;
        }
        int factors[] = {2,3,5};
        for(int factor:factors){
            while(n%factor==0){
                n/=factor;
            }
        }
        return n==1;
        
    }
}