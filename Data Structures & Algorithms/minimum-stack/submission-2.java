class MinStack {
    Stack<Integer> st;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
    }
    
    public void pop() {
      st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        Stack<Integer> temp = (Stack<Integer>) st.clone();
        int min = Integer.MAX_VALUE;
        while(!temp.isEmpty()){
            min = Math.min(min , temp.pop());
        }
        return min;
    }
}
