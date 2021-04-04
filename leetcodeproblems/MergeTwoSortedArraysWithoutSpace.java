class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int index=m;
        int i=0;
        int j=0;
        while(i<nums1.length && j<n){
            
            if(nums1[i]>nums2[j]){
                int pos=index;
                while(pos>i){
                    int temp=nums1[pos];
                    nums1[pos] = nums1[pos-1];
                    nums1[pos-1] =temp;
                    pos--;
                }
                nums1[pos]=nums2[j];
                i++;
                j++;
                index++;
            }else{
                i++;
            }
        }
        
        while(j<n){
            nums1[index]=nums2[j];
            index++;
            j++;
        }
        
    }
}
