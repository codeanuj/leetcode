//Take two pointer i on 1 and j on 0


class RemoveDuplicateFromSortedArray {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length==0){
            return 0;
        }
        
        int i=1;
        int j=0;
        
        while(i<nums.length){
            if(nums[i]!=nums[i-1]){
                j++;
                nums[j]=nums[i];
            }
            i++;
        }
    return j+1;
    }
}
