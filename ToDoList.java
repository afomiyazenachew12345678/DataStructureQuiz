
public class ToDoList {
    private Node head;
    
    public void setHead(Node head) {
        this.head = head;
    }

    public void addTodo(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void markTodoAsCompleted(String title) {
        Node current = head;
        while (current != null) {
            Task task = current.getTask();
            if (task.getTitle().equals(title)) {
                task.setCompleted(true);
                break;
            }
            current = current.getNext();
        }
    }

    public void viewTodoList() {
        Node current = head;
        if (current == null) {
            System.out.println("Todo List is empty.");
        } else {
            System.out.println("Todo List:");
            while (current != null) {
                Task task = current.getTask();
                System.out.println("Title: " + task.getTitle());
                System.out.println("Description: " + task.getDescription());
                System.out.println("Completed: " + task.isCompleted());
                System.out.println("------------------------");
                current = current.getNext();
            }
        }
    }
}