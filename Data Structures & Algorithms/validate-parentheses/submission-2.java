// class Solution {
//     public boolean isValid(String s) {
//         while(true){
//             String temp = s;
//             temp = s.replace("()" , "").replace("{}" , "").replace("[]" , "");
//             if(temp.equals(s)){
//                 break;
//             }
//             s = temp;
//         }
//         return s.isEmpty();
//     }
// }


class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                else{
                    char top = st.peek();
                    if((ch == ')' && top == '(') || (ch == '}' && top == '{') || (ch == ']' && top == '[')){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }
}
