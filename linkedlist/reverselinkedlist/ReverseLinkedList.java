package linkedlist.reverselinkedlist;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert( 1);
        list.insert( 2);
        list.insert( 2);
        list.insert( 5);
        list.insert( 5);
        list.insert( 6);
        list.insert( 7);
        list.insert( 8);

        list.reverse();

        System.out.println("reversed linked list : " + list);
    }
}
