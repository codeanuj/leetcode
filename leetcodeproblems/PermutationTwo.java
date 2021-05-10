class Solution {
    HashMap<Integer, Integer> hm = new HashMap<>();
    Set<List<Integer>> result = new HashSet<List<Integer>>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        for(int i=0; i<nums.length; i++){
            hm.merge(nums[i], 1, Integer::sum);
        }
        int[] box = new int[nums.length];
        getPermutation( nums, 0 , box);
        List<List<Integer>> answer = new ArrayList<List<Integer>>(result);
        return answer;
    }
    
    public void getPermutation(int[] nums, int index, int[] box){
     
        if(index == box.length){
            List<Integer> list = Arrays.stream(box).boxed().collect(Collectors.toList());
            result.add(list);
            return;
        }
        
        for(int i=0; i<nums.length; i++){
            
            int count=0;
            int freq = hm.get(nums[i]);
            for(int j=0; j<index; j++){
                
                if(box[j] == nums[i]){
                    count++;
                }
            }
            if(freq>count){
                box[index]= nums[i];
                getPermutation(nums, index+1, box);
                box[index]=-11;
            }
        }
    }
}
