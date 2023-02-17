package lesson3;

public class MyLinkedList<T> {

    private Node<T> head;


    public Node<T> getHead() {
        return head;
    }

    /**
     * Добавить элемент в начало списка
     *
     * @param value значение
     */
    public void addFirst(T value) {
        Node<T> node = new Node<>(value);
        if (head != null) {
            node.setNext(head);
        }
        head = node;
    }

    /**
     * Удалить элемент из начала списка
     */
    public void removeFirst() {
        if (head != null) {
            head = head.getNext();
        }
    }

    /**
     * Найти элемент
     *
     * @param value значение
     * @return результат поиска
     */
    public boolean contains(T value) {
        Node<T> node = head;
        while (node != null) {
            if (node.getValue().equals(value))
                return true;
            node = node.getNext();
        }
        return false;
    }

    /**
     * Добавить элемент в конец списка
     *
     * @param value значение
     */
    public void addLast(T value) {
        Node<T> node = new Node<>(value);
        if (head == null) {
            head = node;
        } else {
            Node<T> last = head;
            while (last.getNext() != null) {
                last = last.getNext();
            }
            last.setNext(node);
        }
    }

    /**
     * Удалить элемент из конца списка
     */
    public void removeLast() {
        if (head == null)
            return;
        Node<T> last = head;
        while (last.getNext() != null) {
            if (last.getNext().getNext() == null) {
                // Удаляем ссылку на последний элемент
                last.setNext(null);
                return;
            }
            last = last.getNext();
        }
        head = null;
    }

    /**
     * Развлрачивает односвязный список итеративным способом
     */
    public void reverse() {
        if (head == null || head.getNext() == null) return;


        Node<T> prev = null;
        Node<T> next;
        Node<T> curNode = head;

        while (curNode != null) {
            next = curNode.getNext();
            curNode.setNext(prev);
            prev = curNode;
            curNode = next;
        }

        head = prev;
    }
}
