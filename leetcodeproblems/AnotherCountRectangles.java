public class AnotherCountRectangles {
    public int solve(int[] A, int B) {
        
      //with two pointer we can solve this
        int i =0; int j=A.length-1;
        long area;
        long count=0;
        long mod=1000000007;
        while(i<=j){
            //Important part is this here you need to take long for precision
            area= ((long)A[i]*A[j]);
            if(area<B){
              //different config rectangle so a*b is diff from b*a
                count=((count%mod)+(((j-i)*2)%mod+1))%mod;
                i++;
            }else{
                j--;
            }
        }
        
        
        return (int)(count);
    }
}
