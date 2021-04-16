//Simple intution is count the number expand the count to String with the nuumber

class CountAndSay {
    public String countAndSay(int n) {
          String answer = formString(n);
        return answer;
        }
    
  String formString(int n){
     //base case
     if(n==1){
         return "1";
     }   
    //call function rercursively
    String s =formString(--n);
    //length==1
    if(s.length()==1){
        return "11";
    }
    //if you don't use string builder runtime will be 20ms (with String builder 2 ms)
     StringBuilder result=new StringBuilder();
     int count=1;
     for(int i=1; i<s.length(); i++){
       //if previous character and current char is same increase cont
         if(s.charAt(i-1)==s.charAt(i)){
             count++;
         }else{
           //else append the count and previous char
             result.append(count);
             result.append(String.valueOf(s.charAt(i-1)));
             count=1;
         }
     }
         //In the end append the count and last char 
         result.append(count); 
         result.append(String.valueOf(s.charAt(s.length()-1)));
     
     return result.toString();
     
 }
}
