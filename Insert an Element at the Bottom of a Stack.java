class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        Stack<Integer> stack1 = new Stack<>();
        while (!st.isEmpty()) stack1.push(st.pop());
        
        stack1.push(x);
        
        Stack<Integer> stack2 = new Stack<>();
        while (!stack1.isEmpty()) stack2.push(stack1.pop());
        return stack2;
    }
}