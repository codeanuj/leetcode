class Solution {
    public int addDigits(int num) {
        int result = add(num);
        return result;
    }
    
   int add(int num){
       
       if(num/10==0){
           return num;
       }else{
           int n=0;
           while(num>0){
               n+=(num%10);
               num/=10;
           }
           
           int result = add(n);
            return result;
       }
      
}
}
