//intuition is very clear trim the string to remove space
//now take one pointer and move it from last till you find space that will be your last world

class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        
        if(s.length()==0){
            return 0;
        }
       int j=s.length()-1;
        
        while(j>=0){
            if(s.charAt(j)==' '){
                break;
            }
            j--;
        }
        
        int result =s.length()-j-1;
        return result;
    }
}
