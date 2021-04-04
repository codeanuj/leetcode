/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        //Intution is basically find the mid point and call the method if found the version then corrupt 
        
        int ans=0;
        
        //initialize low as 1 high=n
        int low=1;
        int high=n;
        int mid;
        boolean flag;
        while(low<=high){
            //find mid
            mid=low+(high-low)/2;
            //call BadVersion to check is mid is bad or not
            flag=isBadVersion(mid);
            
            //if yes we found one possible candiddate for answer and search for better one
            //else find the candidate
            if(flag){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        
        return ans;
    }
}
