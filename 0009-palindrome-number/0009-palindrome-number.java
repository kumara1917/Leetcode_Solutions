class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) return false;
        int num=x;
        int sum=0;
        while (num>0){
            int rem = num%10;
            sum = sum*10+rem;
            num/=10;
        }
        System.out.print(sum);
        if (sum==x) return true;
        return false;
    }
}