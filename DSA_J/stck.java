package DSA_J;

import java.util.Stack;

public class stck {
  Stack<Integer> stk;
  Stack<Integer> minStack;

  public void MinStack() {
    stk = new Stack<>();
    minStack = new Stack<>();
    ;

  }

  public void push(int val) {
    stk.push(val);
    if (minStack.empty() || val <= minStack.peek()) {
      minStack.push(val);
    }

  }

  public void pop() {
    if (stk.peek().equals(minStack.peek()))
      minStack.pop();
    stk.pop();
  }

  public int top() {
    return stk.peek();

  }

  public int getMin() {
    return minStack.peek();
  }

  public static void main(String[] args) {
    Stack<Integer> stk = new Stack<>();
    System.out.println(stk.empty());
    stk.push(1);
    stk.push(2);
    stk.push(3);
    stk.push(4);
    System.out.println(stk.peek());
    System.out.println(stk);
    stk.pop();
    stk.pop();
    System.out.println(stk);
    System.out.println(stk.search(2));
  }

}
