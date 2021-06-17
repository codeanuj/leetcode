public class PermutationOfStringAInStringB {
    public int solve(String A, String B) {
        
        int[] freqA= new int[26];
        int[] freqB= new int[26];
        
        for(int i=0; i<A.length(); i++){
            freqA[A.charAt(i)-'a']++;
        }
        
        for(int i=0; i<A.length(); i++){
            freqB[B.charAt(i)-'a']++;
        }
        
        int count=isSame(freqA, freqB);
        int right=A.length();
        int left=0;
        while(right<B.length()){
            freqB[B.charAt(right)-'a']++;
            freqB[B.charAt(left)-'a']--;
            count+=isSame(freqA, freqB);
            right++;
            left++;
        }
        
        return count;
    }
    
    int isSame(int[] freqA, int[] freqB){
        
        for(int i=0; i<26;i++){
         if(freqA[i]!=freqB[i]) return 0;   
        }
        
        return 1;
    }
}
