/Basic intution is when you find mid atleast one of the part of array is strictly increasing order so just use thst

class SearchInRotatedSortedArrayOptimized {
public int search(int[] nums, int target) {

    int result =-1;
    int low = 0;
    int high = nums.length-1;
    
    while(low<=high){
        int mid = (low+high)/2;
        
        if(nums[mid] == target){
            result =mid;
            break;
        }
		//if first half is in increasing order
		else if(nums[low]<=nums[mid] ){
		   // if target is in range of subarray
            if(target>=nums[low] && nums[mid]>=target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
		//if second half is in increasing order
		else if(nums[high]>=nums[mid] ){
            if(target>=nums[mid] && nums[high]>=target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
    }
    return result;
}
