package lesson2;

class SortUtils {
    static void directSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            if (index != i) {
                int buf = array[i];
                array[i] = array[index];
                array[index] = buf;
            }
        }
    }

    static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    static void quickSort(int[] array, int startPosition, int endPosition) {
        int left = startPosition;
        int right = endPosition;
        int middle = array[left + (right - left) / 2];

        do {
            while (array[left] < middle) {
                left++;
            }
            while (array[right] > middle) {
                right--;
            }
            if (left <= right) {
                if (left < right) {
                    int buf = array[left];
                    array[left] = array[right];
                    array[right] = buf;
                }
                left++;
                right--;
            }
        }
        while (left <= right);
        if (left < endPosition) {
            quickSort(array, left, endPosition);
        }
        if (startPosition < right) {
            quickSort(array, startPosition, right);
        }
    }

    /**
     * Сортирует массив методом пирамидальной сортировки. Исходный массив при этом изменяется
     * @param array Исходный массив
     */
    static void heapSort(int[] array) {
        buildHeapTree(array);
        for (int i = array.length - 1; i >= 0 ; i--) {
            swap(array, 0, i);
            heapify(array, 0, i);
        }

    }

    /**
     * Строит "кучу" из массива array
     * @param array
     */
    private static void buildHeapTree(int[] array) {
        int size = array.length;
        for (int i = size / 2 - 1; i >= 0 ; i--) {
            heapify(array, i, size);
        }
    }

    /**
     * Восстанавливает свойство "кучи" в поддереве array начиная с узла root
     * @param array Двоичное дерево
     * @param root Корень поддерева
     * @param heapSize Размер кучи
     */
    private static void heapify(int[] array, int root, int heapSize) {
        int maxNode = root;
        int leftNode = maxNode * 2 + 1;
        int rightNode = maxNode * 2 + 2;

        if (leftNode < heapSize && array[leftNode] > array[maxNode]) {
            maxNode = leftNode;
        }

        if (rightNode < heapSize && array[rightNode] > array[maxNode]) {
            maxNode = rightNode;
        }

        if (maxNode == root) {
            return;
        }

        swap(array, maxNode, root);
        heapify(array, maxNode, heapSize);
    }

    /**
     * Переставляет местами элементы массива array по индексам i, j
     * @param array
     * @param i
     * @param j
     */
    private static void swap(int[] array, int i, int j) {
        int tmp  = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

}
