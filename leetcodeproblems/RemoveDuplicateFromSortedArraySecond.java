class Solution {
    public int removeDuplicates(int[] nums) {
        
      int i=2;
      int j=i;
        
      while(i<nums.length){
          if(nums[i]!=nums[j-2]){
              nums[j]=nums[i];
              j++;
          }
          i++;
      }  
       return j; 
        
    }
}
