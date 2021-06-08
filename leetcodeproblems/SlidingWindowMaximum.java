public class SlidingWindowMaximum {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] slidingMaximum(final int[] A, int B) {
        
        Deque<Integer> queue = new LinkedList();
        int[] result = new int[A.length-B+1];
        int count=0;
        for(int i=0; i<A.length; i++){
            //if element is outside window
            if(!queue.isEmpty() && i-queue.getFirst()>=B){
                queue.removeFirst();
            }
            //if any number in queue less than current number
            while(!queue.isEmpty() && A[queue.getLast()]<A[i]){
                queue.removeLast();
            }
            //add current element
            queue.add(i);
            
            //if window is complete
            if(i>=B-1){
                result[count]=A[queue.getFirst()];
                count++;
            }
        }
        return result;
    }
}
