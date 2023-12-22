package Solution;

class Solution {
	 
    public int trap(int[] height) {
        int n = height.length;
        if (n <= 2) {
            return 0; // Not enough bars to trap water
        }

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int trappedWater = 0;
        for (int i = 1; i < n - 1; i++) {
            int minHeight = Math.min(leftMax[i], rightMax[i]);
            trappedWater += Math.max(0, minHeight - height[i]);
        }

        return trappedWater;
    }
}
  
