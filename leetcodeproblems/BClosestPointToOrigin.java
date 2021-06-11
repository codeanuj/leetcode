public class BClosestPointToOrigin {
    public int[][] solve(int[][] A, int B) {
       
      int distance[]= new int[A.length];
      int[][] result=new int[B][2];
      for(int i=0; i<A.length; i++){
          
          int x=A[i][0]*A[i][0];
          int y=A[i][1]*A[i][1];
          distance[i]=x+y;
      }
      
      Arrays.sort(distance);
      
      int minDistance=distance[B-1];
      int count=0;
       for(int i=0; i<A.length; i++){
          
          int x=A[i][0]*A[i][0];
          int y=A[i][1]*A[i][1];
          int dist = x+y;
          
          if(dist<=minDistance && count<B){
              result[count][0]=A[i][0];
              result[count][1]=A[i][1];
              count++;
          }
      }
      
      return result;
    }
}
