package linkedlist.findmiddlenode;

public class MiddleNodeOfLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert( 1);
        list.insert( 2);
        list.insert( 3);
        list.insert( 4);
        list.insert( 5);
        list.insert( 5);

        System.out.println("Middle node value : "+list.middleValue());
    }
}
