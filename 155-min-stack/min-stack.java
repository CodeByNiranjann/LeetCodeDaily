class MinStack {
        Stack<int[]>stack;
    public MinStack() {
        stack=new Stack<>();
    }
    
    public void push(int value) {
        int []curr=new int[]{value,value};
       if(!stack.isEmpty()){
            curr[1]=Math.min(curr[1],stack.peek()[1]);
        
       } 
        stack.push(curr);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
       return  stack.peek()[0];
    }
    
    public int getMin() {
        return stack.peek()[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */