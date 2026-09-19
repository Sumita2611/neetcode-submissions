class Solution {
    public void fun(String s,int n,int length,List<String> ans){
        if(length == 2*n){
            if(isValid(s)){
                ans.add(s);
            }
            return;
        }
        s += '(';
        fun(s,n,length+1,ans);
        s = s.substring(0,s.length()-1);
        s += ')';
        fun(s,n,length+1,ans);
    }
    public boolean isValid(String s){
        int cnt = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                cnt++;
            }
            else{
                cnt--;
            }
            if(cnt < 0){
                return false;
            }
        }
        if(cnt == 0){
            return true;
        }
        return  false;
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        fun("",n,0,ans);
        return ans;
    }
}
