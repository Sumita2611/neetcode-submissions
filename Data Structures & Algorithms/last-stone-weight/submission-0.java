class Solution {
    public int lastStoneWeight(int[] stones) {
      List<Integer> list = new ArrayList<>();
      for(int x : stones){
        list.add(x);
      }
      while(list.size() > 1){
        int max1 = Collections.max(list);
        list.remove(Integer.valueOf(max1));
        int max2 = Collections.max(list);
        list.remove(Integer.valueOf(max2));
        if(max1 != max2){
            list.add(Math.abs(max1-max2));
        }
      }
      if(list.isEmpty()){
        return 0;
      }  
      return list.get(0);
    }
}
