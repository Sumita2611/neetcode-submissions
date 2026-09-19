class Pair{
    int first,second;
    Pair(int first,int second){
     this.first = first;
     this.second = second;
    }
}
class MinStack {
    Stack<Pair> st;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        int min;
        if(st.isEmpty()){
            min = val;
        }
        else{
            min = Math.min(val,st.peek().second);
        }
        st.push(new Pair(val,min));
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().first;
    }
    
    public int getMin() {
        return st.peek().second;
    }
}
