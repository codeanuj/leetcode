//Intution is find the pivot element. Pivot element is the one which is greater then their adjacent element 

class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int result=-1;
        int pivotIndex=-1;
        int low=0;
        int high =nums.length-1;
      
      //To find pivot index
        while(low<=high){
            int mid=low+(high-low)/2;
            //mid is greater then mid-1 and mid+1;
            if(mid>0 && mid<nums.length-1 && nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                pivotIndex=mid;
                break;
            }//mid is greater than low means pivot is in upper half
            else if(nums[mid]>nums[low]){
                low=mid+1;
            }//mid is less than high means pivot is in lower half
            else if(nums[high]>nums[mid]){
                high=mid-1;
            }  
        }
        
        //if pivot index is target return it
        if(nums[pivotIndex]==target){
            return pivotIndex;
        }
        //check the range if target is between low and pivot
        if(target > nums[0]){
            low=0;
            high=pivotIndex;
        }
      //if target is between pivot and high
        if( target<nums[nums.length-1]){
            low=pivotIndex;
            high=nums.length-1;
        }
        //apply binary search
        while(low<=high){
            int mid=(low+high)/2;
            
            if(nums[mid]==target){
                result=mid;
                break;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        
        return result;
    }
}



//Time complexity = O(2*logn)
