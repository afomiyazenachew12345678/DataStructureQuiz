
public class LinkedList {
	private Node head;
	public void insertAtPos(int position, Task task) {
        Node newNode = new Node(task);

        if (position == 1) {
            newNode.setNext(head);
            head = newNode;
        } else {
            Node current = head;
            int currentPosition = 1;

            while (current != null && currentPosition < position - 1) {
                current = current.getNext();
                currentPosition++;
            }

            if (current == null) {
                System.out.println("Invalid position. Insertion is not possible.");
            } else {
                newNode.setNext(current.getNext());
                current.setNext(newNode);
            }
        }
	}


	
	 public void deleteAtPos(int position) {
	        if (head == null) {
	            System.out.println("The list is empty. Deletion is not possible.");
	            return;
	        }

	        if (position == 1) {
	            head = head.getNext();
	        } else {
	            Node current = head;
	            int currentPosition = 1;

	            while (current != null && currentPosition < position - 1) {
	                current = current.getNext();
	                currentPosition++;
	            }

	            if (current == null || current.getNext() == null) {
	                System.out.println("Invalid position. Deletion is not possible.");
	                return;
	            }

	            Node nodeToDelete = current.getNext();
	            current.setNext(nodeToDelete.getNext());
	        }
	 }
	        public void deleteAfterPos(int position) {
		        if (head == null || head.getNext() == null) {
		            System.out.println("Deletion is not possible. The list is empty or contains only one node.");
		            return;
		        }

		        Node current = head;
		        int currentPosition = 1;

		        while (current != null && currentPosition < position) {
		            current = current.getNext();
		            currentPosition++;
		        }

		        if (current == null || current.getNext() == null) {
		            System.out.println("Invalid position. Deletion is not possible.");
		            return;
		        }

		        Node nodeToDelete = current.getNext();
		        current.setNext(nodeToDelete.getNext());
		    }
	        public int searchNode(Task task) {
		        Node current = head;
		        int position = 1;

		        while (current != null) {
		            if (current.getTask().equals(task)) {
		                return position;
		            }
		            current = current.getNext();
		            position++;
		        }

		        return -1; 
		    }
}
	       
	           
	            


		  
		



	    


	    
	



