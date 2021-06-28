class Solution {
    public int maxProduct(int[] nums) {
     
        int answer=nums[0];
        int max=nums[0];
        int min=nums[0];
        
        for(int i=1; i<nums.length; i++){
            //whenever find negative number just swap the min and max
            if(nums[i]<0){
                int temp=max;
                max=min;
                min=temp;
            }
            
            max=Math.max(nums[i], nums[i]*max);
            min=Math.min(nums[i], nums[i]*min);
            
            answer=Math.max(answer, max);
        }
        
        return answer;
    }
}
