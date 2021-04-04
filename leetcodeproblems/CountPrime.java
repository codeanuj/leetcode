class Solution {
    public int countPrimes(int n) {
        
        
        //intution is you can precalulate it by sieve
        if(n<=2){
            return 0;
        }
        int[] sieve=new int[n+1];
        
        for(int i=2; i*i<=n; i++){
            //if element is 0 means it was not touched yet
            if(sieve[i]==0){
                
                for(int j=i; j<=n; j+=i){
                    
                    if(i!=j && sieve[j]!=1){
                        sieve[j]=1;
                    }
                }
            }
        }
        
        int count=0;
        for(int i=2; i<n; i++){
            if(sieve[i]==0){
                count++;
            }
        }
        return count;
    }
}
