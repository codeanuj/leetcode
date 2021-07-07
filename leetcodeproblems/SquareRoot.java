class Solution {
    public int mySqrt(int x) {
        
        int result=0;
        if(x==0) return 0;
        int low=0;
        int high=x;
        int mid;
        while(low<=high){
            mid= high-(high-low)/2;
            
            if(x/mid==mid){
                result =mid;
                break;
            }else if(x/mid>mid){
                result=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        
        return result;
    }
}
