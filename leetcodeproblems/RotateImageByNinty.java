class RotateImageByNinty {
    public void rotate(int[][] matrix) {
        
        int top=0; 
        int n=matrix.length;
        
        while(top<n){
            int i=top;
            int j=top;
            
            while(i<n && j<n){
                int temp = matrix[i][top];
                matrix[i][top] = matrix[top][j];
                matrix[top][j]=temp;
                i++;
                j++;
            }
            top++;
        }
        
        
     
        int down=0;
        while(down<n){
            int i=0;
            int j=n-1;
           while(i<j){
             int temp=matrix[down][j];
             matrix[down][j]=matrix[down][i];
             matrix[down][i]= temp;
             i++;
             j--;
          }
            down++;
        }
    }
}
