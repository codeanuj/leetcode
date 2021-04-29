//intution is generate all the permutation and take a pointer count if count ==k then this will be your answer

class PermutationSequence {
    int count=0;
    StringBuilder result= new StringBuilder();
    public String getPermutation(int n, int k) {

        int[] box =new int[n];
        getPermutationSeq(n, k, 0, box);
            
        return result.toString();
    }
    
    
    public void getPermutationSeq(int n, int k, int index, int[] box){        
        if(index==box.length){
            count++;
            
            if(k==count){
                for(int l=0; l<box.length; l++){
                    result.append(String.valueOf(box[l]));
                }
            }
            return;
        }
        
        for(int i=1; i<=n; i++){
            boolean flag = true;
            for(int j=0; j<index; j++){
                if(i==box[j]){
                    flag=false; 
                    break;
                }
            }
            if(flag){
                box[index]=i;
                getPermutationSeq(n, k, index+1, box);
                box[index]=0;
            }
            
        }
        
        
    }
}
