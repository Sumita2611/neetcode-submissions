class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mp = new HashMap<>();
        for(String s : strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if(!mp.containsKey(sorted)){
                mp.put(sorted , new ArrayList<>());
            }
            mp.get(sorted).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}
