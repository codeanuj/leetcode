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
