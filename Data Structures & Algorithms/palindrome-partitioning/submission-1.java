class Solution {
    public boolean isPalin(int l , int r , String s){
        while(l <= r){
        if(s.charAt(l++) != s.charAt(r--)){
            return false;
        }
        }
        return true;
    }
    public void fun(int ind , String s, List<String> list , List<List<String>> ans){
        if(ind == s.length()){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = ind;i < s.length();i++){
            if(isPalin(ind,i,s)){
                list.add(s.substring(ind,i+1));
                fun(i+1,s,list,ans);
                list.remove(list.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> list = new ArrayList<>();
        fun(0,s,list,ans);
        return ans;
    }
}
