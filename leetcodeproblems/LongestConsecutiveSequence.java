class Solution {
    public int longestConsecutive(int[] nums) {
        
        int max_length=0;
        int count=0;
        HashMap<Integer, Integer> hm = new HashMap();
        
        for(int i=0; i<nums.length; i++){
            hm.putIfAbsent(nums[i], i);
        }  
        //if any key-1 exist leave it because that can not be the start of the consecutive elements 
      //else key can be start so find it Tc will o(n)
        for(int i=0; i<nums.length; i++){
            
            int key =nums[i];
            if(hm.containsKey(key-1)){
                continue;
            }else{
                while(hm.containsKey(key)){
                count++;
                key++;
              }
            }
            max_length=Math.max(max_length, count);
            count=0;
        }
        
        return max_length;
    }
}
