class Solution {
    
    List<List<Integer>> ansList = new ArrayList<List<Integer>>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
       generateSubset(nums, 0, new ArrayList<>());
        return ansList;
    }
    
    public void generateSubset(int[] nums, int index, List<Integer> list){
       
       ansList.add(new ArrayList<>(list));
		for(int i=index; i<nums.length; i++) {
			if(i!=index && nums[i]==nums[i-1]) continue;
		list.add(nums[i]);	
		generateSubset (nums, i+1, list);
		list.remove(list.size()-1);
		}
	
        
    }
}
