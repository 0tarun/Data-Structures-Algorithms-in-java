
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SingleLinkedList {

    Node head;

    SingleLinkedList() {
        this.head = null;
    }

    public void linkAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void linkAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        sll.linkAtFirst(1);
        sll.linkAtFirst(2);
        sll.linkAtFirst(3);
        

        sll.display();  

        sll.linkAtLast(4);
        sll.display();  
        
    }
}
