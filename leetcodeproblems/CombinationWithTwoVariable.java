public class Solution {
    
    ArrayList<ArrayList<Integer>> ansList = new ArrayList<ArrayList<Integer>>();
    
    public ArrayList<ArrayList<Integer>> combine(int A, int B) {
        
        generateCombinations(A, B, 0, new ArrayList<Integer>());
        return ansList;
    }
    
    public void generateCombinations(int A, int B, int index, ArrayList<Integer> list){
        
         if(index ==B){
	            ansList.add(new ArrayList(list));
	            return;
	        }
	        
	        for(int i=1; i<=A; i++){
            //In combination remember this if you want combination in sorting order first sort the array(here array is not given)
            //then do a check because i is getting start from 1 every time so check whether your is greater than previous added element of the list or not in case of unique element
            //in case of duplicates track the count with same condition insteas >= just>
	            if(index>0 && list.get(list.size()-1)>=i)continue;
	            list.add(i);
	            generateCombinations(A, B, index+1, list);
	            list.remove(list.size()-1);
	        }
	    
    }
}
