class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int top=0; int bottom = matrix.length-1;
        int left=0; int right = matrix[0].length-1;
        
        while(top<=bottom && left <=right){
            
            int current = matrix[top][right];
            
            if(current==target){
                return true;
            }else if(target>current){
                top++;
            }else{
                right--;
            }
        }
        return false;
    }
}
