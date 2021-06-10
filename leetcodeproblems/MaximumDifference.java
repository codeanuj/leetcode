public class Solution {
    public int solve(int[] A, int B) {
        
        Arrays.sort(A);
        int s1=0;
        int size=0;
        if(B>(A.length/2)){
            size=A.length-B;
        }
        int sum=0;
        for(int i=0;i<A.length;i++){
                sum+=A[i];
        }
        
        if(size>0){
            for(int i=A.length-1;i>=size;i--){
                s1+=A[i];
            }
        }else{
            for(int i=0;i<B;i++){
                s1+=A[i];
            }
        }
        
        int s2=sum-s1;
        
        int result = Math.abs(s1-s2);
        return result;
       
    }
}
