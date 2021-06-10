public class SortUsingStack {
    public int[] solve(int[] A) {
        //basic intution is take two stack1 and stack2 
        
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
        
        for(int i=0; i<A.length; i++){
            int element = A[i];
            //if stack1 top is greater than pop the top and push it in stack2
            //basically our stack1 will always be sorted
            //stack2 we are using to store the popped elements of stack1
            while(!stack1.isEmpty() && stack1.peek()>element){
                stack2.push(stack1.pop());
            }
            
            stack1.push(element);
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
        }
        int i=A.length-1;
        while(!stack1.isEmpty()){
            A[i]=stack1.pop();
            i--;
        }
        return A;
        
    }
}
