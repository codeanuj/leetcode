class Solution {
    public void setZeroes(int[][] matrix) {
         
        int a =1;
        
        int bottom = matrix.length;
        int right = matrix[0].length;
        
        for(int i=0; i<bottom; i++){
            if(matrix[i][0]==0) a=0;
            for(int j=0; j<right; j++){
                
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        
        for(int i= bottom-1; i>=0; i--){
            for(int j= right-1; j>=0; j--){
                
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
                
            }
            if(a==0) matrix[i][0]=0;
        }
                
    }
} 
