
public class LinkedListStack {
    private Node top;

    public void push(Task task) {
        Node newNode = new Node(task);

        if (top == null) {
            top = newNode;
        } else {
            newNode.setNext(top);
            top = newNode;
        }
    }

    public Task pop() {
        if (top == null) {
            System.out.println("Stack is empty. Cannot perform pop operation.");
            return null;
        }

        Task task = top.getTask();
        top = top.getNext();
        return task;
    }

    public Task peek() {
        if (top == null) {
            System.out.println("Stack is empty. Cannot perform peek operation.");
            return null;
        }

        return top.getTask();
    }

    public boolean isEmpty() {
        return top == null;
    }
}