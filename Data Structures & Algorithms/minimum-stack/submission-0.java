class MinStack {
    int min=Integer.MAX_VALUE;
    Stack<Integer> stack ;
    public MinStack() {
        stack=new Stack<>();
    }
    public void push(int val) {
       if(min>=val){
         stack.push(min);
          min=val;
         
       }   
       stack.push(val);
    }
     
    public void pop() {
        if(stack.pop()==min)min=stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}
