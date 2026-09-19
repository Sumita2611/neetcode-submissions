class Pair{
    int ele;
    int freq;
    Pair(int ele,int freq){
        this.ele = ele;
        this.freq = freq;
    }
}
class Solution {
    public  int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer> mp = new HashMap<>();
       for(int x : nums){
        mp.put(x,mp.getOrDefault(x,0)+1);
       }
       PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> b.freq - a.freq);
       for(Integer x : mp.keySet()){
        pq.add(new Pair(x,mp.get(x)));
       }
       int[] ans = new int[k];
       for(int i = 0;i < k;i++){
        ans[i] = pq.poll().ele;
       }
       return ans;
    }
}
