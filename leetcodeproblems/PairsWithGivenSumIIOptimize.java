public class PairsWithGivenSumIIOptimize {
    public int solve(int[] A, int B) {
        
        int i=0; int j = A.length-1;
        int sum; long pair=0;
        int mod =1000000007;
       
        
        while(i<j){
            sum = A[i]+A[j];
            if(sum==B){
                
                long count1=0;
                long count2=0;
               
                if(A[i]==A[j]){ 
                    while(i<j){
                        if(A[i]==A[j]){
                            count1++;
                            i++;
                            continue;
                        }
                        break;
                    }
                    long value= (((count1%mod)*((count1+1)%mod))/2)%mod;
                    pair += value;
                }else{
                    count1=1;
                    count2=1;
                    while(i<j && A[i+1]==A[i]){
                        count1++;
                        i++;
                    }
                    while(i<j && A[j-1]==A[j]){
                        count2++;
                        j--;
                    }
                    
                    pair=(pair%mod+(count1*count2)%mod)%mod;
                    i++;
                    j--;
                }
                
            }else if(sum>B){
                j--;
            }else{
                i++;
            }
            
        }
        return (int)pair;
    }
}
