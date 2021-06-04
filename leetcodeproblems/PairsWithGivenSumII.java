public class PairsWithGivenSumII {
    public int solve(int[] A, int B) {
        
        int i=0; int j = A.length-1;
        int sum; long pair=0;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int k=0; k<A.length; k++){
            
            int key = A[k];
            hm.put(key, hm.getOrDefault(key, 0) + 1);;
        }
        int mod =1000000007;
       
        
        while(i<j){
            sum = A[i]+A[j];
            if(sum==B){
                
                long count1= hm.get(A[i]);
                long count2= hm.get(A[j]);
               
                if(A[i]==A[j]){
                    long value= (((count1%mod)*((count1-1)%mod))/2)%mod;
                    pair += value;
                }else{
                    pair=(pair%mod+(count1*count2)%mod)%mod;
                }
                i+=count1;
                j-=count2;
            }else if(sum>B){
                j--;
            }else{
                i++;
            }
            
        }
        return (int)pair;
    }
}
