public class Solution {
    public int maxArea(int[] A) {
        
        int left=0;
        int right=A.length-1;
        if(A.length==1){
            return 0;
        }
        int area=Integer.MIN_VALUE;
        int minHeight;
        while(left<right){
          //basic concept is find minHeight
            minHeight=Math.min(A[left], A[right]);
            int a= minHeight*(right-left);
            area=Math.max(area, a);
          //move the pointer of minHeight
            if(minHeight==A[left]){
                left++;
            }else{
                right--;
            }
            
        }
        
        return area;
    }
}
