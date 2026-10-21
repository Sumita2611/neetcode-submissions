class Pair{
    int freq , ele;
    Pair(int freq , int ele){
        this.freq = freq;
        this.ele = ele;
    }
}
class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer , Integer> mp = new HashMap<>();
        for(int x : nums){
            if(!mp.containsKey(x)){
                mp.put(x ,1);
            }
            else{
                mp.put(x , mp.get(x) + 1);
            }
        }
        int ind = 0;
        Pair[] arr = new Pair[mp.size()];
        for(Integer x : mp.keySet()){
            arr[ind++] = new Pair(mp.get(x) , x);
        }
        Arrays.sort(arr , new Comparator<Pair>(){
            public int compare(Pair p1 , Pair p2){
                if(p1.freq == p2.freq){
                    return p2.ele - p1.ele;
                }
                return p1.freq - p2.freq;
            }
        });
        ind = 0;
        int[] ans = new int[nums.length];
        for(Pair x : arr){
            for(int i = 0;i < x.freq;i++){
                ans[ind++] = x.ele;
            }
        }
        return ans;
    }
}