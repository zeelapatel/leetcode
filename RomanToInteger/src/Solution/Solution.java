package Solution;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        int sum=0;
        Map<String, Integer> h=new HashMap<>();
        // Adding key-value pairs
        h.put("I", 1);
        h.put("V", 5);
        h.put("X", 10); 
        h.put("L", 50);
        h.put("C", 100);
        h.put("D", 500);
        h.put("M", 1000);   
        String[] a = s.split("");
        for(int i=1;i<a.length;i++){
            if(h.get(a[i])>h.get(a[i-1])){
                sum-=h.get(a[i-1]);
            }
            else{
                sum+=h.get(a[i-1]);
            }
            
        }
        sum += h.get(a[a.length - 1]);
        return sum;

    }
}