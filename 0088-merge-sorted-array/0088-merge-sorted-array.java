class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1.length==0 || nums2.length==0) return;
        int[] arr=new int[m];
        for (int i=0; i<m;i++){
            arr[i]=nums1[i];
        }
        int ind1 = 0;
        int ind2 = 0;
        for (int i=0;i<nums1.length;i++){
            if(ind1==m){
                nums1[i] = nums2[ind2];
                ind2++;
            }
            else if(ind2==n){
                nums1[i] = arr[ind1];
                ind1++;
            }
            else{
                if(arr[ind1]<=nums2[ind2]){
                    nums1[i] = arr[ind1];
                    ind1++;
                }
                else{
                    nums1[i] = nums2[ind2];
                    ind2++;
                }
            }
        }
    }
}