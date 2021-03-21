class Solution {
    public int romanToInt(String s) {
        
     //The intution is if you find roman which is greater than sum add it in sum
     //If smaller delete this roman from sum // we are runnig loop from end of String
     
        int sum=0;
        for(int i =s.length()-1; i>=0; i--){
            char c = s.charAt(i);
            int k=0;
            
            if(c == 'I'){
                k=1;
            }else if(c == 'V'){
                k=5;
            }else if(c == 'X'){
                k=10;
            }else if(c == 'L'){
                k = 50;
            }else if(c == 'C'){
                k=100;
            }else if(c == 'D'){
                k = 500;
            }else{
                k=1000;
            }
            
            if(sum<=k ||(i<(s.length()-1) && s.charAt(i+1)==c)){
                sum+=k;
            }else{
                sum-=k;
            }
            
        }
        
        return sum;
    }
}
