/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class PostOrderTravesalInTreeWithoutRecursion {
    public ArrayList<Integer> postorderTraversal(TreeNode A) {
        
        
        
        //basic intution is if left node is null then check the right  node if it is also null you are allowed to pop out the current node and also check the element which you have popped is the 
        //right child of current top if yes that means you have already visited the right subtree so you can also pop this out and repeat this until stack is empty stack.top.right does not match 
        //with pop element
        
        Stack<TreeNode> stack = new Stack();
        ArrayList<Integer> result = new ArrayList();
        if(A==null) return result;
        
        TreeNode curr=A;
        TreeNode temp;
        
        while(curr!=null || !stack.isEmpty()){ //here we use or condition
            if(curr!=null){
                stack.push(curr);
                curr= curr.left;
            }else{
                temp=stack.peek().right;
                
                if(temp==null){
                    temp=stack.pop();
                    result.add(temp.val);
                    while(!stack.isEmpty() && stack.peek().right==temp){
                        temp=stack.pop();
                        result.add(temp.val);
                    }
                }else{
                    curr=temp;
                }
            }
        }
       return result; 
    
    }
}
