public class IntersectionOfArrayIntersectionOfArray{

public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> map = new HashMap();
        ArrayList<Integer> list = new ArrayList();
        for(int i=0; i<nums1.length; i++){
            
            int key = nums1[i];
            
            if(map.containsKey(key)){
                int value = map.get(key);
                map.put(key, ++value);
            }else{
                map.put(key,1);
            }
        }
        
        
        for(int i=0; i<nums2.length; i++){
            
            if(map.containsKey(nums2[i])){
                int value = map.get(nums2[i]);
                if(value>0){
                    map.put(nums2[i], --value);
                    list.add(nums2[i]);
                }
            }
        }
        int[] result= new int[list.size()];
        int j=0;
        for(int i:list){
            result[j]=i;
            j++;
        }
        
        return result;
    }
}
