package linkedlist.linkedlistimplementation;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class LinkedList {
    Node head;

    public void insert(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    @Override
    public String toString() {
        Node currNode = head;

        StringBuilder listOfDate = new StringBuilder();
        while (currNode != null) {
            listOfDate.append(currNode.data + " ");

            currNode = currNode.next;
        }
        return listOfDate.toString();
    }


}

