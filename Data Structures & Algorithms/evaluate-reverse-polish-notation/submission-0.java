class Solution {
    public boolean isOperator(String s){
        if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
            return true;
        }
        return false;
    }
    public int fun(int num2,int num1,String s){
        switch(s){
            case "+": return num2 + num1;
            case "-": return num2 - num1;
            case "*": return num2 * num1;
            case "/": return num2 / num1;
            default : throw new IllegalArgumentException("Invalid Operator" + s);
        }
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String s : tokens){
            if(isOperator(s)){
                int num1 = st.pop();
                int num2 = st.pop();
                int ans = fun(num2,num1,s);
                st.push(ans);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}
