class Solution {
    public boolean checkValidString(String s) {
        
        //This is to check the balancing of opening brackets
        Stack<Integer> stack1 = new Stack();
        //This is to store the *
        Stack<Integer> stack2 = new Stack();
        
        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            
            if(c=='(')
                stack1.push(i);
            else if(c=='*')
                stack2.push(i);
            else{
                if(!stack1.isEmpty()){
                    stack1.pop();
                }else if(!stack2.isEmpty()){
                    stack2.pop();
                }else{
                    return false;
                }
            }
        }
        
        //if stack 1 has opening brackets
        while(!stack1.isEmpty()){
            //stack 2 is empty if not then * value must be greater than ( value.
            if(stack2.isEmpty())
                return false;
            else if(stack2.peek()>stack1.peek()){
                stack2.pop();
                stack1.pop();
            }else 
                return false;
            
        }
        
        return true;
    }
}
