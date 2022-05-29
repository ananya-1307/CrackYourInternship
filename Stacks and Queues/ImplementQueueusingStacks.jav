class MyQueue {
Stack<Integer>input;
    Stack<Integer>output;
    public MyQueue() {
        input=new Stack<>();
        output=new Stack<>();
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
        if(output.empty()==false){
            return output.pop();
        }else{
            while(input.empty()==false){
                output.push(input.peek());
                input.pop();
            }
            return output.pop();
        }
    }
    
    public int peek() {
         if(output.empty()==false){
           return  output.peek();
        }else{
            while(input.empty()==false){
                output.push(input.peek());
                input.pop();
            }
             return output.peek();
        }
    }
    
    public boolean empty() {
        if(output.empty()==true && input.empty()==true){
            return true;
        }
        return false;
    }
}

