public class TaskScheduler {
    public int solve(int[] A, int[] B) {
        
        Queue<Integer> queue = new LinkedList();
        int count=0;
        for(int i=0;i<A.length; i++){
            queue.add(A[i]);
        }
        
        for(int i=0;i<B.length; i++){
            while(B[i]!=queue.peek()){
                count++;
                int element=queue.remove();
                queue.add(element);
            }
            queue.remove();
            count++;
        }
        
        return count;
    }
}
