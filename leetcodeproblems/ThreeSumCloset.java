//The basic intution is you need to find the closest possible sum of three integers with target so that can be done f sum and target are very close so you check the
//difference between target and sum and maintain one pointer if found lower than update the pointer and update the answer with sum

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        int result=Integer.MAX_VALUE;
        int answer=0;
        
        //-4,-1,1,2
      //length-2 because need to find the triplets
        for(int i=0; i<nums.length-2; i++){
            
            int low= i+1;
            int high= nums.length-1;
            //two pointer approach
            while(low<high){
                int sum= nums[i]+nums[low]+nums[high];
              if(sum>target){
                    if((sum-target)<result){
                        result = sum-target;
                        answer=sum;
                    }
                    high--;
                }else{
                    if((target-sum)<result){
                        result =target-sum;
                        answer=sum;
                    }
                    low++;
                }
            }
        }
        
        return answer;
    }
}
