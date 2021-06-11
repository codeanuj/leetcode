public class SubMatrixSumQueries {
    public int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {
        int aux[][] = new int[A.length][A[0].length];
        int mod=1000000007;
        aux[0][0]=A[0][0];
        //first column prefix sum
        for(int i =1; i<A.length; i++){
            aux[i][0] = (aux[i-1][0]%mod+A[i][0]%mod)%mod;
        }
        //first row prefix sum
          for(int i =1; i<A[0].length; i++){
            aux[0][i] = (aux[0][i-1]%mod+A[0][i]%mod)%mod;
        }
        //calculate prefix sum of matrix
        for(int i=1; i<A.length; i++){
            for(int j=1; j<A[0].length; j++){
                aux[i][j]=(aux[i-1][j]%mod+aux[i][j-1]%mod)%mod;
//aux[i][j]=(aux[i][j]%mod-aux[i-1][j-1]%mod+mod)%mod;
                aux[i][j]=((aux[i][j] % mod - aux[i - 1][j - 1]) % mod + mod) % mod;
                aux[i][j]=(aux[i][j]%mod+A[i][j]%mod)%mod;
            }
        }
        
        int top; 
        int left;
        int bottom;
        int right;
        int[] result=new int[B.length];
        for(int i=0;i<B.length; i++){
            top=B[i]-1;
            left=C[i]-1;
            bottom=D[i]-1;
            right=E[i]-1;
            
            long sum=aux[bottom][right];
            
            if((top-1)>=0) sum= ((sum%mod)-(aux[top-1][right]%mod)+mod)%mod;
            if((left-1)>=0) sum= ((sum%mod) -(aux[bottom][left-1]%mod)+mod)%mod;
            
            if((top-1)>=0 && (left-1)>=0) sum=((sum%mod)+ (aux[top-1][left-1]%mod))%mod;
            if(sum<0) sum+=mod;
            result[i]= (int)sum;
            
            
        }
        return result;
        
    }
}
