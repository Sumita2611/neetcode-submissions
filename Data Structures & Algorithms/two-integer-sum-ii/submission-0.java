class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0,r = numbers.length-1;
        while(numbers[l] + numbers[r] != target){
            if(numbers[l] + numbers[r] > target){
                r--;
            }
            else if(numbers[l] + numbers[r] < target){
                l++;
            }
        }
        int[] ans = new int[2];
        ans[0] = l+1;
        ans[1] = r+1;
        return ans; 
    }
}
