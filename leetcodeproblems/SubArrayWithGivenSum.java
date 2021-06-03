public class SubArrayWithGivenSum {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
         
        ArrayList<Integer> result = new ArrayList<Integer>();
      //If no arraylist found
      result.add(-1);
	        int i=0; int j=0;
	        int curr_sum=A.get(0);
	        while(i<=j){
	            if(curr_sum == B){
	                result.remove(0);
	                while(i<=j){
	                    result.add(A.get(i));
	                    i++;
	                }
	                break;
	            }else if(curr_sum<B){
	                j++;
                  //important part check everytime so you won't get indexoutofbounf exception
	                if(j==A.size()){
	                break;
	                }
	               curr_sum+= A.get(j);
	               
	            }else{
	               curr_sum-= A.get(i);
	               i++;
	            }
	            
	            
	        }
	        return result;
	    
    }
}
