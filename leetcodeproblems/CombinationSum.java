//Intution is you need to do backtracking and resursion if you are searching for combination, permutation and subsequence etc.


class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> l = new ArrayList<Integer>();
        getCombination(candidates, 0, target,list, l);
        
        return list;
    }
    
   void getCombination(int[] a,int index, int target,List<List<Integer>> list, List<Integer> l){
       //base condition
       if(index == a.length){
         //if target becomes 0 means you found one combination
           if(target==0){
               list.add(new ArrayList(l));
              }
           
           return;
       }
       
     //if array element is less than or equal to target means pick it
       if(a[index]<= target){
           l.add(a[index]);
           getCombination(a, index, target-a[index], list,l);
         //when you backtrack you also need to remove this element
           l.remove(l.size()-1);
       }
     //don't pick
           getCombination(a, index+1, target,list, l);
   }
}



//TC= 2^t*k 
