class Solution {
    public int[][] generateMatrix(int n) {
        
        //Take four boundries
        int top=0, left=0;
        int bottom=n-1, right=n-1;
        
        //
        int result[][]=new int[n][n];
        int number=1;
        
        //for boundry check
        while(top<=bottom && left<=right){
            
            //start from left go till right
            //one row is complete
            for(int i=left; i<=right; i++){
                result[top][i]=number;
                number++;
            }
            //increase the row
            top++;
            
            //start from top go till bottom
            //one column is complete
            for(int i=top; i<=bottom; i++){
                result[i][right]=number;
                number++;
            }
            //decrease the column
            right--;
            
            //start from right go till left
            //one row in complete
             for(int i=right; i>=left; i--){
                result[bottom][i]=number;
                number++;
            }
            //decrease the row
            bottom--;
            
             //start from bottom go till top
            //one column in complete
            for(int i=bottom; i>=top; i--){
                result[i][left]=number;
                number++;
            }
            //increase the column
            left++;
        }
        
        
        return result;
    }
}
