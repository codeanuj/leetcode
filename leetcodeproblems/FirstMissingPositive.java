class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        
        //Intution is if any number is not available on index+1 then that is missing because we are searching for positive
        //now  we will make array like this only
        for(int i=0; i<nums.length; i++){
            
            //take postition 
            int pos= nums[i]-1;
            
            //position is in range and to handle duplicate 
             while((pos>=0 && pos<nums.length) && pos!=i && pos!=(nums[pos]-1)){
                int temp= nums[pos];
                nums[pos] = pos+1;
                nums[i]=temp;
                pos = nums[i]-1;
            }
        }
        
        //if position is not equal with index+1 return it
        for(int i=0; i<nums.length; i++){
            
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        
        //if all number available then return length+1
        return nums.length+1;
    }
}
