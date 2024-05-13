import java.util.Scanner;
public class NumberSearch {
	 private Stack stack1; 
     private Stack stack2;
		 Scanner input = new Scanner(System.in);
		private Stack Stack;

		       
		           
		            public NumberSearch() {
		                Stack = new Stack();
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

		            
		            public int dequeue() {
		                if (stack1.isEmpty()) {
		                    System.out.println("Queue is empty. Cannot dequeue element.");
		                    return -1;
		                }

		                int dequeuedElement = stack1.pop();
		                System.out.println("Dequeued element: " + dequeuedElement);
		                return dequeuedElement;
		            }

		           
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
		        System.out.print("Enter a sequence of numbers (space-separated): ");
		        String inputStr = input.nextLine();
		        String[] numbersStr = inputStr.split(" ");
		        int[] numbers = new int[numbersStr.length];
		        for (int i = 0; i < numbersStr.length; i++) {
		            numbers[i] = Integer.parseInt(numbersStr[i]);
		        }

		       
		        System.out.print("Enter a number to be searched: ");
		        int searchNum = input.nextInt();

		       
		        int occurrences = countOccurrences(numbers, searchNum);

		       
		        if (occurrences > 0) {
		            System.out.println("The number " + searchNum + " is present in the array.");
		            System.out.println("It appears " + occurrences + " time(s).");
		        } else {
		            System.out.println("The number " + searchNum + " is not present in the array.");
		        }
		    

		    public static int countOccurrences(int[] arr, int num) {
		        int count = 0;
		        for (int element : arr) {
		            if (element == num) {
		                count++;
		            }
		        }
		        return count;
		    }
		}

	}



