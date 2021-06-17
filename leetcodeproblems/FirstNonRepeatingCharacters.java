public class FirstNonRepeatingCharacters {
    public String solve(String A) { 
        
        if(A==null) return null;
        
        Queue<Character> queue= new LinkedList();
        
        StringBuilder result= new StringBuilder();
        int[] freq=new int[26];
        
        for(int i=0; i<A.length();i++){
            
            char c= A.charAt(i);
            
            queue.add(c);
            freq[c-'a']++;
            //queue is not empty and freq of peek is greater than one then remove the element
            while(!queue.isEmpty() && freq[queue.peek()-'a']>1){
                queue.remove();
            }
          //if queue is not empty and freq of peek is less than equals to 1 then append it in result;
            if(!queue.isEmpty() && freq[queue.peek()-'a']<=1){
                result.append(queue.peek());
            }
            //if queue is empty no character available
            if(queue.isEmpty())
               result.append("#");
        }
        
        return result.toString();
    }
    
}
