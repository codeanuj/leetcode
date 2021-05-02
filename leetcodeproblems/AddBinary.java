class Solution {
    public String addBinary(String a, String b) {
        
        int length;
        StringBuilder result= new StringBuilder();
        if(a.length()>b.length()){
            length=a.length()-1;
        }else{
            length=b.length()-1;
        }
        
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        int sum=0;
        while(length>=0){ 
            sum+=carry;
            sum+= (i>=0?Integer.parseInt(String.valueOf(a.charAt(i))):Integer.parseInt("0"));
            sum+= (j>=0?Integer.parseInt(String.valueOf(b.charAt(j))):Integer.parseInt("0"));
            
            if(sum%2==0){
                result.append("0");
            }else{
                result.append("1");
            }
            
            if(sum>1){
                carry=1;
            }else{
                carry=0 ;
            }
            i--;
            j--;
            length--;
            sum=0;
                
        }                      
        
        if(carry>0){
            result.append("1");
        }
        
     return result.reverse().toString();   
    }
}
