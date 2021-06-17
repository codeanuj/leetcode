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
public class InOrderTraversalInTreeWithoutRecursion {
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        
        ArrayList<Integer> result= new ArrayList();
        TreeNode curr=A;
        
        if(curr==null) return result;
        
        Stack<TreeNode> stack = new Stack<>();
        
        while(curr!=null || !stack.isEmpty()){
            if(curr!=null){
                stack.push(curr);
                curr=curr.left;
            }else{
                TreeNode temp= stack.pop();
                result.add(temp.val);
                curr=temp.right;
            }
        }
        
        return result;
    }
}
