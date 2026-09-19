class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int max_area = 0;
        int i = 0,j = n-1;
        while(i < j){
            int h = Math.min(heights[i] , heights[j]);
            int w = j-i;
            int area = h*w;
            max_area = Math.max(max_area , area);
            if(heights[i] < heights[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max_area;
    }
}
