class Solution {
    
    Set<List<Integer>> answer = new HashSet<List<Integer>>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       generateSubset(nums, 0, new ArrayList<>());
       List<List<Integer>> result = new ArrayList<List<Integer>>(answer); 
        return result;
    }
    
    public void generateSubset(int[] nums, int index, List<Integer> list){
       //base case
       if(index==nums.length){
           List<Integer> l = new ArrayList<>();
           
           for(int p=0; p<list.size(); p++){
               int current = list.get(p);
               if(current!=0){
                   l.add(nums[p]);
               }
           }
         //orting it so no duplicate can be found ex[1,4] and [4,1]
           Collections.sort(l);
           answer.add(l);
         
           return;
       } 
        
        for(int i=0; i<2; i++){
            list.add(i);
            generateSubset(nums, index+1, list);
            list.remove(list.size()-1);
        }
        
    }
}
