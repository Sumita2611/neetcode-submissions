class Solution {
    List<String> ans = new ArrayList<>();
    public void fun(int ind , String digits , StringBuilder temp , Map<Character , String> mp){
        if(ind >= digits.length()){
            ans.add(temp.toString());
            return;
        }
        char ch = digits.charAt(ind);
        String str = mp.get(ch);
        for(int i = 0;i < str.length();i++){
            temp.append(str.charAt(i));
            fun(ind+1,digits,temp,mp);
            temp.deleteCharAt(temp.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            return new ArrayList<>();
        }
        Map<Character , String> mp = new HashMap<>();
        mp.put('2',"abc");
        mp.put('3',"def");
        mp.put('4',"ghi");
        mp.put('5',"jkl");
        mp.put('6',"mno");
        mp.put('7',"pqrs");
        mp.put('8',"tuv");
        mp.put('9',"wxyz");
        StringBuilder temp = new StringBuilder();
        fun(0,digits,temp,mp);
        return ans;
    }
}
