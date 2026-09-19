class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int x : nums){
            mp.put(x , mp.getOrDefault(x,0)+1);
        }
        for(int x : nums){
            if(mp.get(x) == 1){
                return x;
            }
        }
        return -1;
    }
}
