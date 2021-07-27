// Time Complexity : 0(1)
// Space Complexity : 0(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : NO
// Your code here along with comments explaining your approach

class MinStack {

    /** initialize your data structure here. */
    
    Stack<Integer> s;
    int min;  
    public MinStack() {
        s = new Stack<>(); //Initialize the stack
        min = Integer.MAX_VALUE; // Initialize the integer value    
    }
     public void push(int val) {
        if(val<=min){ // if the value is less than infinity
         s.push(min); // push the element into the stack
          min = val;    //update the minimum value
    }
    s.push(val); //if the element is not minimum also , push the element into the stack.
    }
         public void pop() {
         int top = s.pop(); // pop the top element in the stack
         if(top==min) // if the pop element is min
         {
         min = s.pop(); // we again pop the element and update the minimum
    }
}
    public int top() {
        return s.peek(); // get the top element in the stack.
        
    }
    
    public int getMin() {
         return min; //get the minimum element.
    }
}











