class PascalTriangleTwo {
    public List<Integer> getRow(int rowIndex) {
        
        int[][] pascal = new int[rowIndex+1][];
        
       for(int i=0; i<pascal.length; i++){
           pascal[i]=new int[i+1];
           for(int j=0; j<pascal[i].length; j++){
               if(j==0 || j == pascal[i].length-1){
                   pascal[i][j]=1;
                   continue;
               }
               
               pascal[i][j]= pascal[i-1][j-1]+pascal[i-1][j];
           }
       }
        
        List<Integer> result = new ArrayList<Integer>();
        for(int j=0; j<pascal[rowIndex].length; j++){
            result.add(pascal[rowIndex][j]);
        }
        
        return result;
    }
}
