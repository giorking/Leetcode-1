class MyStack {
    // Push element x onto stack.
    Queue<Integer> q = new LinkedList<Integer>();
    public void push(int x) {
        int size = q.size();
        q.offer(x);
        while (size-- > 0) {
            q.offer(q.poll());
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        q.poll();
    }

    // Get the top element.
    public int top() {
        return q.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q.isEmpty();
    }
}
