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
public class PreOrderTravesalWithoutRecursion {
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        
        ArrayList<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack();
        //basic inution is first we have to visit left node then right node then current node
        if(A==null){
            return result;
        }
        TreeNode curr = A;
        while(curr!=null || !stack.isEmpty()){
            if(curr!=null){
               result.add(curr.val);
               stack.push(curr);
               curr=curr.left;
            }else{
                TreeNode temp = stack.pop();
                curr=temp.right;
            }
        }
        
        return result;
    }
}
