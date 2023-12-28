package Solution;

import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
       int  x=0;
       Arrays.sort(strs);
       StringBuilder s= new StringBuilder();
       char[] first =  strs[0].toCharArray();
       char[] last = strs[strs.length-1].toCharArray(); 
       for( int i = 0; i<first.length; i++){
           if(first[i]!=last[i]){
                break;
           }
           else{
           s.append(first[i]);
           }
       }
       return s.toString();   
    }
}