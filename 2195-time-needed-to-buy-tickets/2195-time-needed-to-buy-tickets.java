class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int seconds=0;
        while(tickets[k]>0){
            for (int i=0; i<tickets.length; i++){
                if (tickets[i]>0 &&tickets[k]!=0){
                    tickets[i]--;
                    seconds++;
                }
            }
        }
        return seconds;
    }
}