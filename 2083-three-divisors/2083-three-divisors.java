class Solution {
    public boolean isThree(int n) {
     int count =0;
     for(int i=1;i*i<=n;i++){
        if(n%i==0){
            count += (i * i == n) ? 1 : 2;      
        }

     }
     return count==3;
    }
}