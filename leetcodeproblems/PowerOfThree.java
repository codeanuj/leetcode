class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        
        while(n>0 && n%3==0){
            n/=3;
        }
     if(n==1){
         return true;
     } 
        return false;
    }
}
//For any M <= N that is a power of 3, M divides N.
//For any M <= N that is not a power 3, M does not divide N.

//if M divides 1162261467 then it is power of 3 otherwise no
