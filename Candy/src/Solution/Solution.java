package Solution;

import java.util.Arrays;

public class Solution {
    public int candy(int[] ratings) {
        int[] a = new int[ratings.length];
        int sum=0;
// Initialize all elements of the array to 1
        Arrays.fill(a, 1);
// left to right 
        for(int i =1 ;i<ratings.length;i++){
            if(ratings[i-1]<ratings[i]){
                a[i]=a[i-1]+1;
            }
        }
        for(int i =ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1] && a[i]<=a[i+1]){
                a[i]=a[i+1]+1;
            }
        }
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum ;
    }
}