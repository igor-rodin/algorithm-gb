package lesson3;

public class BiNode {

    private int value;
    private BiNode next;
    private BiNode prev;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BiNode getNext() {
        return next;
    }

    public void setNext(BiNode next) {
        this.next = next;
    }

    public BiNode getPrev() {
        return prev;
    }

    public void setPrev(BiNode prev) {
        this.prev = prev;
    }


    public BiNode(int value) {
        this.value = value;
    }
}
