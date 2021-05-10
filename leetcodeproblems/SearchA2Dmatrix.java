class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left=0; int right = matrix[0].length-1;
        int top=0; int bottom = matrix.length-1;
        
        while(top<=bottom && left<=right){
            //start with top right or bottom left 
            //so you can ignore one row or one column directly
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
