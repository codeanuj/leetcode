//convert number in string 
//run a loop from 0 to n/
//maintain a pointer product
//second loop j from i to n
//make a hashset and add the vlue if seen reject it
public class Solution {
    public int colorful(int A) {
        
        String s= String.valueOf(A);
        HashSet<Integer> hs= new HashSet<>();
        
        for(int i=0; i<s.length(); i++){
            int product =1;
            for(int j=i; j<s.length();j++){
                int element=s.charAt(j)-'0';
                product*=element;
                if(!hs.add(product)){
                    return  0;
                }
            }
        }
        return 1;
    }
}
