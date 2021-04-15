class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        // loop till length-3
        for(int i=0; i<nums.length-3; i++){
          //to avoid the duplicates like -2,-2,0,1,2 case here -2 and -2
            if(i==0 || (i>0 && nums[i-1]!=nums[i])){
               for(int j=i+1; j<nums.length-2;j++){
                 //to avoid the duplicacy
                   if(j==(i+1) || (j>(i+1) && nums[j-1]!=nums[j])){
                   int sum=target-nums[i]-nums[j];
                
                   int low=j+1;
                   int high=nums.length-1;
                   //like two sum problem
                   while(low<high){
                       if((nums[low]+nums[high])==sum){
                           List<Integer> list = new ArrayList<Integer>();
                           list.add(nums[i]);
                           list.add(nums[j]);
                           list.add(nums[low]);
                           list.add(nums[high]);
                           result.add(list);
                           //-2,-2,-2,0,0,0,0,2,2,2,2
                         //ans will be -2,0,0,2 only
                           while(low<high && nums[low]==nums[low+1])low++;
                           while(low<high && nums[high]==nums[high-1])high--;
                           
                           low++;
                           high--;
            
                       }else if((nums[low]+nums[high])>sum){
                           high--;
                       }else{
                           low++;
                       }
                   }
                 }  
              }
            }   
        }
        return result;
    }
}
