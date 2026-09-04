class MinStack {
    Stack<Integer>stack;
    Stack<Integer>min;
    public MinStack() {
       stack=new Stack<>();
       min=new Stack<>(); 
    }
    public void push(int value) {
        if(stack.isEmpty())
        {
            stack.push(value);
            min.push(value);
            return ;
        }
        stack.push(value);
        if(value<=min.peek())
        {
            min.push(value);
        } 
    }
    public void pop() {
        if(stack.isEmpty())
        {
            return ;
        }
        int val=stack.pop();
        if(val==min.peek())
        {
            min.pop();
        }
        
    }
    public int top() {
        if(stack.isEmpty())
        {
            return -1;
        }
        return stack.peek();
    }
    
    public int getMin() {
          if(stack.isEmpty())
        {
            return -1;
        }
        return min.peek();
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