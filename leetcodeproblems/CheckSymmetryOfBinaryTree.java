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
public class CheckSymmetryOfBinaryTree {
    public int isSymmetric(TreeNode A) {
        int result=checkSymmetry(A.left, A.right);
        return result;
    }
    
   public int checkSymmetry(TreeNode root1, TreeNode root2){
       //if both root null means it is symmetric at that point
       if(root1==null && root2==null) return 1;
      //if one of the root is not null then it is asymmetric
       if(root1==null || root2==null) return 0;
     //root values not equal it is not symmetric
       if(root1.val!= root2.val) return 0;
      
       int a=checkSymmetry(root1.left, root2.right) ;
       int b=checkSymmetry(root1.right, root2.left);
       if(a==1 && b==1) return 1;
       else return 0;
        
    }
}
