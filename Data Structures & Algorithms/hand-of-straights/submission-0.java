class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
       if(hand.length % groupSize != 0){
        return false;
       }
        //sorted map
       TreeMap<Integer,Integer> mp = new TreeMap<>();
       for(int x : hand){
        mp.put(x,mp.getOrDefault(x,0)+1);
       }
       while(mp.size() != 0){
        int curr = mp.firstKey(); // first element in map
        for(int i = 0;i < groupSize;i++){
            if(!mp.containsKey(curr+i)){ // check consecutive is present or not
                return false;
            }
            mp.put(curr+i,mp.get(curr+i)-1); // add curr+i and also remove -1 by updating the frequency
            if(mp.get(curr+i) == 0){
                mp.remove(curr+i);
            }
        }
        
       }
       return true;
    }
}
