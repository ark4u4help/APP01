public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Adding numbers to the linked list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Displaying the linked list
        list.display();
    }
}

class LinkedList {
    Node head;

    // Node class representing each element in the linked list
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to add a new element to the linked list
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    // Method to display the linked list
    public void display() {
        Node currentNode = head;

        System.out.print("Linked List: ");
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }
}
