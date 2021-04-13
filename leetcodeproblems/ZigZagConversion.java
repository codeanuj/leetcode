//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

//P   A   H   N
//A P L S I I G
//Y   I   R
//And then read line by line: "PAHNAPLSIIGYIR"

//Write the code that will take a string and make this conversion given a number of rows:

//string convert(string s, int numRows);


class Solution {
    public String convert(String s, int numRows) {
        
        if(numRows==1){
            return s;
        }
        
        String[] str= new String[numRows];
        int row=0;
        char[] ch = s.toCharArray();
        String flag= "down";
        
        Arrays.fill(str,"");
        for(int i=0; i<s.length(); i++){
            
            str[row]+=String.valueOf(ch[i]);
            
            if(row == numRows-1){
                flag="up";
            }
            
            if(row==0){
                flag= "down";
            }
            
            
            if(flag=="up"){
                row--;
            }else{
                row++;
            }
        }
        
        String result ="";
        for(int i=0; i<str.length; i++){
            result += str[i];
        }
        
        return result;
    }
}
