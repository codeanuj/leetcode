class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        
        //nums.length-2 because you need to finf three numbers so after nums.length-2, two number remains
        for(int i=0; i<nums.length-2; i++){
            
            if(i==0 ||(i>0 && nums[i-1]!=nums[i])){
                int low= i+1;
                int high= nums.length-1;
                //looking triplet a+b+c=0
                int sum=0-nums[i];
                
                while(low<high){
                    if(nums[low] + nums[high] ==sum){
                        List<Integer> list = new ArrayList();
                        list.add(nums[i]);
                        list.add(nums[low]);
                        list.add(nums[high]);
                        result.add(list);
                        
                        //This is specially for these type cases
                        //[-2,0,0,0,0,2,2,2,2]
                        while(low<high && nums[low]==nums[low+1])low++;
                        while(low<high && nums[high]==nums[high-1])high--;
                        
                        high--;
                        low++;
                    }else if(nums[low]+nums[high]>sum){
                        high--;
                    }else{
                        low++;
                    }
                }
            }
        }
        
        return result;
    }
}
