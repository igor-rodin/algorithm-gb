package lesson3;

public class BiMyLinkedList {

    private BiNode head;
    private BiNode tail;

    public void addFirst(int value){
        BiNode node = new BiNode(value);
        if (head != null){

            node.setNext(head);
            head.setPrev(node);
        }
        else {
            tail = node;
        }
        head = node;
    }

    public void removeFirst(){
        if (head != null && head.getNext() != null){
            head.getNext().setPrev(null);
            head = head.getNext();
        }
        else {
            head = null;
            tail = null;
        }
    }

}
