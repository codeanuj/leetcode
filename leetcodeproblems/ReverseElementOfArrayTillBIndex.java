public class ReverseElementOfArrayTillBIndex {
    public int[] solve(int[] A, int B) {
        
        if(B>A.length){
            return A;
        }
        
        Stack<Integer> stack = new Stack();
        
        for(int i=0;i<B; i++)
            stack.push(A[i]);
        
        int k=0;
        while(!stack.isEmpty()){
             A[k]=stack.pop();
             k++;
        }
        
        return A;
    }
}
