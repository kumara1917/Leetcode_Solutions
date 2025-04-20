class Solution {
    public String convertToTitle(int columnNumber) {
        int n=columnNumber;
        int x=0;
        StringBuilder sc=new StringBuilder();
        while(n>0){
            n--;
            x=n%26;
            n=n/26;
            sc.append((char)(x+'A'));
        }
        return sc.reverse().toString();
    }
}