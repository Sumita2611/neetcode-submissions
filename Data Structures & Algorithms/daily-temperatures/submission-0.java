class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        for(int i = 0;i < n;i++){
            int cnt = 1;
            int j = i+1;
            while(j < n){
                if(temperatures[j] > temperatures[i]){
                    break;
                }
                cnt++;
                j++;
            }
            cnt = (j == n) ? 0 : cnt;
            ans[i] = cnt;
        }
        return ans;
    }
}
