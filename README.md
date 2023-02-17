# Алгоритмы и структуры данных (семинары)

## Урок 2. Структуры данных. Массивы. Алгоритмы массивов.
    
### Реализовать алгоритм пирамидальной сортировки (сортировка кучей).

## Урок 3. Структуры данных. Связный список.

### Необходимо реализовать метод разворота связного списка (двухсвязного или односвязного на выбор).

```java
    public class MyLinkedList<T> {
        
        private Node head;
        
        //Остальные методы 
    
        /**
         * Разворачивает односвязный список итеративным способом
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
```