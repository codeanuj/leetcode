//This is right roatation of array
//In left rotation your first part will be from 0 to k and second part from k to array length 

public class RightRotate{
  
public void rotate(int[] nums, int k) {     
        //This can be divided into two parts
         k=k%nums.length;
         
        //First part from 0 to p1
        int p1=nums.length-k-1;
        
        int i=0;
        int j=p1;
        
        //reverse first part
        while(i<j)
        {
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;j--;
        }
        
        
        //second part from p1 to array length
        //reverse this part also
        i=p1+1;
        j=nums.length-1;
         while(i<j)
        {
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;j--;
        }
        
        //reverse whole array
        i=0;
        j=nums.length-1;
        
         while(i<j)
        {
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;j--;
        }
}   
}
