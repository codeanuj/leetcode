class Solution {
    
    List<List<Integer>> ansList = new ArrayList<List<Integer>>();
    public List<List<Integer>> combine(int n, int k) {
        int[] box = new int[k];
        generateCombination(0,n,box);
        return ansList;
        
    }
    
    public void generateCombination(int index,int n, int[] box){
        
        if(index==box.length){
            List<Integer> list = Arrays.stream(box).boxed().collect(Collectors.toList());
            ansList.add(list);
            return; 
        }
        
        for(int i=1; i<=n; i++){
            
            if(index>0 && i<=box[index-1]) continue;
            box[index]=i;
            generateCombination(index+1, n, box);
            box[index]=0;
        }
    }
}
