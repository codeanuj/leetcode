class Solution {
    
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    
    public List<List<Integer>> subsets(int[] nums) {
        generateSubset(nums, 0, new ArrayList<>());
        
        return result;
    }
    
    public void generateSubset(int[] nums, int index, List<Integer> list){
        
        //base case
        if(index== nums.length){
            List<Integer> l = new ArrayList<>();
            for(int i=0; i<list.size(); i++){
                int current = list.get(i);
                if(current!=0){
                    l.add(nums[i]);
                }
            }
            
            result.add(l);
            return;
        }
        
        //You have two option select(1) the number or not(0)
        //two choices0 and 1
        //now try these choices on each index
        
        for(int k=0; k<2; k++){
            list.add(k);
            generateSubset(nums, index+1, list);
            list.remove(list.size()-1);
        }
    }
}
