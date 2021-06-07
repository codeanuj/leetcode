class MinStack {
    int top1=-1;
    int top2=-1;
    ArrayList<Integer> stack1 = new ArrayList();
    ArrayList<Integer> stack2 = new ArrayList();
    
    public void push(int x) {
        top1++;
        stack1.add(x);
        
        if(stack2.size()==0 || x<=stack2.get(stack2.size()-1)){
            top2++;
            stack2.add(x);
        }
    
    }

    public void pop() {
        if(top1==-1){
            return;
        }
        int num= stack1.get(stack1.size()-1);
        stack1.remove(stack1.size()-1);
        if(stack2.get(stack2.size()-1)==num){
            stack2.remove(stack2.size()-1);
            top2--;
        }
        top1--;
    }

    public int top() {
        if(top1==-1){
            return -1;
        }
        return stack1.get(stack1.size()-1);
    }

    public int getMin() {
        
        if(top2==-1){
            return -1;
        }
        return stack2.get(stack2.size()-1);
        
    }
}
