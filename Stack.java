
public class Stack {
	
	    private int maxSize;
	    private int[] stackArray;
	    private int top;

	   
	    public Stack() {
	        int size = 0;
			maxSize = size;
	        stackArray = new int[maxSize];
	        top = -1; // Initialize top index to -1 (empty stack)
	    }

	    
	    public void push(int value) {
	        if (top == maxSize - 1) {
	            System.out.println("Stack is full. Cannot push element.");
	            return;
	        }

	        top++;
	        stackArray[top] = value;
	        System.out.println("Pushed element: " + value);
	    }
       public int peek() {
			
			return 0;
		}
	    

	   
	    public int pop() {
	        if (top == -1) {
	            System.out.println("Stack is empty. Cannot pop element.");
	            return -1;
	        }

	        int poppedElement = stackArray[top];
	        top--;
	        System.out.println("Popped element: " + poppedElement);
	        return poppedElement;
	    }

	   
	    public boolean isEmpty() {
	        return (top == -1);
	    }

	   
	    public boolean isFull() {
	        return (top == maxSize - 1);
	    }

	    public static void main(String[] args) {
	        Stack stack = new Stack();

	        stack.push(10);
	        stack.push(20);
	        stack.push(30);

	        stack.pop();
	        stack.pop();
	        stack.pop();
	        stack.pop();
	    }


		
	}


