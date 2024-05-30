
public class ToDoListTest {

	public static void main(String[] args) {
		    Task task1 = new Task("Task 1", "Description for Task 1");
	        Task task2 = new Task("Task 2", "Description for Task 2");
	        Task task3 = new Task("Task 3", "Description for Task 3");

	        
	        Node node1 = new Node(task1);
	        Node node2 = new Node(task2);
	        Node node3 = new Node(task3);

	       
	        node1.setNext(node2);
	        node2.setNext(node3);

	       
	        ToDoList todoList = new ToDoList();
	        todoList.setHead(node1);

	        
	        System.out.println("Todo List:");
	        todoList.viewTodoList();
	    }
	}


	


