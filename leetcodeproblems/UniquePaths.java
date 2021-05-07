class Solution {

    public int uniquePaths(int m, int n) {
        int[][] memorization = new int[m+2][n+2];
        int count=  uniquePathsCalculation(m,n,1,1, memorization);
        return count;
    }
    
    int uniquePathsCalculation(int m, int n,int index1,int index2, int[][] memorization){
        
        if(index1>m || index2>n) return 0;
        if(m==index1 && n==index2) return 1;
        if(memorization[index1][index2] !=0) return memorization[index1][index2];
        
        return memorization[index1][index2] =                  
            uniquePathsCalculation(m,n,index1+1,index2, memorization)+uniquePathsCalculation(m,n,index1, index2+1,     memorization);
    }
    
}
