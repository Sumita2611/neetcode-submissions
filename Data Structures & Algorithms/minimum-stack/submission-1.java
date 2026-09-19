// class Pair{
//     int first,second;
//     Pair(int first,int second){
//      this.first = first;
//      this.second = second;
//     }
// }
// class MinStack {
//     Stack<Pair> st;
//     public MinStack() {
//         st = new Stack<>();
//     }
    
//     public void push(int val) {
//         int min;
//         if(st.isEmpty()){
//             min = val;
//         }
//         else{
//             min = Math.min(val,st.peek().second);
//         }
//         st.push(new Pair(val,min));
//     }
    
//     public void pop() {
//         st.pop();
//     }
    
//     public int top() {
//         return st.peek().first;
//     }
    
//     public int getMin() {
//         return st.peek().second;
//     }
// }



class MinStack {
    Stack<Integer> st;
    Stack<Integer> minSt;
    public MinStack() {
        st = new Stack<>();
        minSt = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(minSt.isEmpty() || val <= minSt.peek()){
            minSt.push(val);
        }
    }
    
    public void pop() {
       if(st.isEmpty()){
        return;
       }
       int top = st.pop();
       if(top == minSt.peek()){
        minSt.pop();
       }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minSt.peek();
    }
}
