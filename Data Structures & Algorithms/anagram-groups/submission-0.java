class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mp = new HashMap<>();
        for(String s : strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String newStr = new String(arr);
            mp.putIfAbsent(newStr,new ArrayList<>());
            mp.get(newStr).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}
