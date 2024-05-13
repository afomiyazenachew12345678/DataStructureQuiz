
public class LinearQueueUsingStacks {
            private Stack stack1; 
		    private Stack stack2; 

		    public LinearQueueUsingStacks() {
		        stack1 = new Stack();
		        stack2 = new Stack();
		    }

		   
		    public void enqueue(int value) {
		        while (!stack1.isEmpty()) {
		            stack2.push(stack1.pop());
		        }

		        stack1.push(value);

		        while (!stack2.isEmpty()) {
		            stack1.push(stack2.pop());
		        }

		        System.out.println("Enqueued element: " + value);
		    }

		    // Method to dequeue an element from the queue
		    public int dequeue() {
		        if (stack1.isEmpty()) {
		            System.out.println("Queue is empty. Cannot dequeue element.");
		            return -1;
		        }

		        int dequeuedElement = stack1.pop();
		        System.out.println("Dequeued element: " + dequeuedElement);
		        return dequeuedElement;
		    }

		    // Method to peek at the front element of the queue
		    public int peek() {
		        if (stack1.isEmpty()) {
		            System.out.println("Queue is empty. Cannot peek element.");
		            return -1;
		        }

		        int frontElement = stack1.peek();
		        System.out.println("Front element: " + frontElement);
		        return frontElement;
		    }

		    public static void main(String[] args) {
		        LinearQueueUsingStacks queue = new LinearQueueUsingStacks();

		        queue.enqueue(10);
		        queue.enqueue(20);
		        queue.enqueue(30);

		        queue.dequeue();
		        queue.peek();
		        queue.dequeue();
		        queue.dequeue();
		        queue.dequeue();
		    }
		}
		

	


