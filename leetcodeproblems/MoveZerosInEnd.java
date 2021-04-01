class MoveZerosInEnd {
    public void moveZeroes(int[] nums) {
        
        int j=0;
        
        while(j<nums.length){
            if(nums[j]==0){
                break;
            }
            j++;
        }
      
        
        for(int i=j+1; i<nums.length; i++){
            if (nums[i]!=0){
                nums[j]=nums[i];
                nums[i]=0;
                j++;
            }
        }
    }
}
