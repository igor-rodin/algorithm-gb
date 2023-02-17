package lesson3;


public class Main {

    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.addLast("1");
        myLinkedList.addLast("2");
        myLinkedList.addLast("3");
        myLinkedList.addLast("4");
        myLinkedList.addLast("5");

        printLinkedList(myLinkedList);

        myLinkedList.reverse();
        System.out.println("Reversed:");
        printLinkedList(myLinkedList);
    }

    private static void printLinkedList(MyLinkedList<String> linkedList) {
        Node<String> current = linkedList.getHead();
        if (current == null) return;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}
