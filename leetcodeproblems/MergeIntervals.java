class Solution {
    public int[][] merge(int[][] intervals) {
        
        //sort the array based ob first interval
        Arrays.sort(intervals, new Comparator<int[]>(){
            
            public int compare(int a[], int b[]){
                return a[0]-b[0];
            }
        });
        
        Stack<int[]> stack = new Stack();
       
        for(int i=0; i<intervals.length; i++){
            //if stack is empty push it directly
            if(stack.isEmpty()){
                stack.push(intervals[i]);
            }else{
                //get the peek element
                int peek[] = stack.peek();
                int current_ele[] = intervals[i];
                
                // if second interval of peek is greater than the current element first interval 
                if(peek[1]>=current_ele[0]){
                    //peek second interval is also less than or equal to current element second interval then it is                           //overlapping
                    if(peek[1]<=current_ele[1]){
                        current_ele[0]=peek[0];
                        stack.pop();
                        stack.push(current_ele);
                    }
                }else{
                    stack.push(intervals[i]);
                }
            }
        }
        
        int[][] result = new int[stack.size()][2];
        
        int j=0;
        while(!stack.isEmpty()){
            result[j]=stack.pop();
            j++;
        }
        
        return result;
    }
}
