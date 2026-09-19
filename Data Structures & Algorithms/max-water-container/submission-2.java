// class Solution {
//     public int maxArea(int[] heights) {
//         int n = heights.length;
//         int max_area = 0;
//         for(int i = 0;i < n;i++){
//             for(int j = i+1;j < n;j++){
//                 int width = j-i;
//                 int height = Math.min(heights[i],heights[j]);
//                 int area = width * height;
//                 max_area = Math.max(area , max_area);
//             }
//         }
//         return max_area;
//     }
// }

class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int max_area = 0;
        int l = 0,r = n-1;
        while(l < r){
            int width = r-l;
            int height = Math.min(heights[l] , heights[r]);
            int area = width * height;
            max_area = Math.max(area , max_area);
            if(heights[l] < heights[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return max_area;
    }
}
