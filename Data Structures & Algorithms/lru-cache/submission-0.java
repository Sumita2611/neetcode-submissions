class LRUCache {
    private int capacity;
    private Map<Integer , Integer> mp;
    private List<Integer> list;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        mp = new HashMap<>();
        list = new ArrayList<>();
    }
    
    public int get(int key) {
        if(!mp.containsKey(key)){
            return -1;
        }
        list.remove(Integer.valueOf(key));
        list.add(key);
        return mp.get(key);
    }
    
    public void put(int key, int value) {
        if(mp.containsKey(key)){
            mp.put(key , value);
            list.remove(Integer.valueOf(key));
            list.add(key);
        }
        else{
            if(mp.size() == capacity){
                int lru = list.get(0);
                list.remove(0);
                mp.remove(lru);
            }
            mp.put(key,value);
            list.add(key);
        }
    }
}
