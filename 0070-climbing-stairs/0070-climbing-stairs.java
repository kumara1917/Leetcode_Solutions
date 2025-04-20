class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        return climbRemainingStairs(dp, n);
    }
    public int climbRemainingStairs(int[] dp, int n){
        if(dp[n]!=0) return dp[n];
        if(n<=1) {
            return 1;
        }
        else{
            dp[n]=climbRemainingStairs(dp, n-2)+climbRemainingStairs(dp, n-1);
            return dp[n];
        }
    }
}