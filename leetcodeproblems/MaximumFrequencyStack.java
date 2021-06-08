public class MaximumFrequencyStack {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        
        HashMap<Integer, Integer> freqMap=new HashMap();
        HashMap<Integer, Stack<Integer>> freqStack = new HashMap();
        int maxFreq=0;
        
        ArrayList<Integer> result = new ArrayList();
        
        for(int i=0; i<A.size(); i++){
            
            ArrayList<Integer> list= A.get(i);
            int element=list.get(1);
            
            if(element==0){
                
                Stack<Integer> stack = freqStack.get(maxFreq);
                int value=stack.pop();
                if(stack.isEmpty()){
                    maxFreq--;
                }
                
                freqMap.put(value, freqMap.getOrDefault(value, 0)-1);
                result.add(value);
                
            }else{
                int count=freqMap.getOrDefault(element,0)+1;
                freqMap.put(element, count);
                
                if(count>maxFreq)
                    maxFreq=count;
                
                
                if(freqStack.containsKey(count)){
                    Stack<Integer> stack = freqStack.get(count);
                    stack.push(element);
                    freqStack.put(count,stack);
                }else{
                    Stack<Integer> stack = new Stack();
                    stack.push(element);
                    freqStack.put(count, stack);
                }
                result.add(-1);
            }
        }
        return result;
    }
}
