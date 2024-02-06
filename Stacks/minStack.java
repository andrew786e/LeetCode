package Stacks;

import java.io.*;
import java.util.*;


// Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

// Implement the MinStack class:

// MinStack() initializes the stack object.
// void push(int val) pushes the element val onto the stack.
// void pop() removes the element on the top of the stack.
// int top() gets the top element of the stack.
// int getMin() retrieves the minimum element in the stack.
// You must implement a solution with O(1) time complexity for each function

public class minStack {
    class MinStack {

        Stack<Integer> normalStack = new Stack<Integer>() ;
        Stack<Integer> minStack = new Stack<Integer>() ;
        public MinStack() {

        }
    
        public void push(int val) {
            if(normalStack.isEmpty()){
                minStack.push(val) ;
            }else{
                int currentMin = minStack.peek() ;
                if(currentMin > val){
                    minStack.push(val);
                }else{
                    minStack.push(currentMin) ;
                }
            }
            normalStack.push(val);
        }
    
        public void pop() {
            normalStack.pop() ;
            minStack.pop() ;
        }
    
        public int top() {
            return normalStack.peek() ;
        }
    
        public int getMin() {
            return minStack.peek() ;
        }
    }
}
