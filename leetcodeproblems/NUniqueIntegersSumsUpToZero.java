class Solution {
    public int[] sumZero(int n) {
        
        //basic intution is create an array of n size and start feeding n/2 elements
        int result[]=new int[n];
        n/=2;
        int i=0;
        while(n>0){
            result[i]=n;
            result[i+1]=n*(-1);
            i+=2;
            n--;
        }
        
        return result;
    }
}
