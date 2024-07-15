package LinkedList;

// ToDO: 1. implement delete a node from linked list
//       2. Investiage and fix why inserting a value at a position that is already occuipied,
//          it throws a null pointer exception

public class SingleLinkedList {

    public Node head;
    public Node tail;
    public int size;

    // Create a linked list
    public Node createLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // insert into a linked list
    // 1. If link is empty
    // 2. inserting at beginning
    // 3. inserting at end
    // 4. inserting anywhere
    public void insert(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            tail.next = node;
            node.next = null;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            // Correct implementation: nextNode is the node currently at the insertion
            // location.
            // The new node is inserted between tempNode and nextNode, avoiding a null
            // pointer error.
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    // Traverse a linked list
    public void traverse() {
        if (head == null) {
            System.out.println("Linked list does not exist");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }

    // Search for a node
    public boolean searchNode(int nodeValue) {
        if (head == null) {
            return false;
        } else {
            Node tempNode = head;
            int i = 0;
            while (tempNode != null) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Node " + nodeValue + " found at location " + i);
                    return true;
                }
                tempNode = tempNode.next;
                i++;
            }
            System.out.println("Node not found");
            return false;
        }
    }

    // Deleting a node from a SLL
    // 1. If link list doesnt exist
    // 2. deleting at the beginnning
    // 3. deleting at the end
    // 4. deleting at any location

    public void delete(int nodeValue) {
        if (head == null) {
            System.out.println("Link list does not exist");
        } else if (head.value == nodeValue) {
            head = head.next;
            size--;
        } else if (tail.value == nodeValue) {
            Node tempNode = head;
            while (tempNode.next != tail) {
                tempNode = tempNode.next;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            while (tempNode.next != null && tempNode.next.value != nodeValue) {
                tempNode = tempNode.next;
            }
            if (tempNode.next != null) {
                tempNode.next = tempNode.next.next;
                size--;
            }
        }
    }

    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        sll.insert(1, 0);
        sll.insert(2, 1);
        sll.insert(3, 2);
        sll.insert(4, 3);
        sll.traverse();
        sll.insert(5, 1);
        sll.traverse();
        sll.searchNode(3);
        sll.delete(3);
        sll.traverse();
    }

}
