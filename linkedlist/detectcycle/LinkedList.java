package linkedlist.detectcycle;

class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class LinkedList {
    private Node head;

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

    public void reverse() {
        if (head == null || head.next == null) {
            return;
        }

        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;

            prev = current;
            current = next;
        }

        head = prev;
    }

    public int middleValue() {

        Node currNode2 = head;
        Node currNode1 = head;

        while (currNode2 != null && currNode2.next != null) {

            currNode1=currNode1.next;
            currNode2 = currNode2.next.next;
        }

        assert currNode1 != null;
        return  currNode1.data;
    }

    public boolean hasCycle() {
        if (head == null || head.next == null) {
            return false;
        }

        Node slowPtr = head;
        Node fastPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

            if (slowPtr == fastPtr) {
                return true;
            }
        }
        return false;
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

